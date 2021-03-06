package uk.co.mruoc.footballdata.model;

import org.junit.Test;
import uk.co.mruoc.footballdata.model.Competition.CompetitionBuilder;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class CompetitionTest {

    private final CompetitionBuilder builder = new CompetitionBuilder();

    @Test
    public void shouldSetSelfLink() {
        String selfLink = "http://api.football-data.org/v1/competitions/444";

        Competition competition = builder
                .setSelfLink(selfLink)
                .build();

        assertThat(competition.getSelfLink()).isEqualTo(selfLink);
    }

    @Test
    public void shouldSetTeamsLink() {
        String teamsLink = "http://api.football-data.org/v1/competitions/444/teams";

        Competition competition = builder
                .setTeamsLink(teamsLink)
                .build();

        assertThat(competition.getTeamsLink()).isEqualTo(teamsLink);
    }

    @Test
    public void shouldSetFixturesLink() {
        String fixturesLink = "http://api.football-data.org/v1/competitions/444/fixtures";

        Competition competition = builder
                .setFixturesLink(fixturesLink)
                .build();

        assertThat(competition.getFixturesLink()).isEqualTo(fixturesLink);
    }

    @Test
    public void shouldSetLeagueTableLink() {
        String leagueTableLink = "http://api.football-data.org/v1/competitions/444/leagueTable";

        Competition competition = builder
                .setLeagueTableLink(leagueTableLink)
                .build();

        assertThat(competition.getLeagueTableLink()).isEqualTo(leagueTableLink);
    }

    @Test
    public void shouldSetId() {
        int id = 444;

        Competition competition = builder
                .setId(id)
                .build();

        assertThat(competition.getId()).isEqualTo(id);
    }

    @Test
    public void shouldSetCaption() {
        String caption = "Campeonato Brasileiro da Série A";

        Competition competition = builder
                .setCaption(caption)
                .build();

        assertThat(competition.getCaption()).isEqualTo(caption);
    }

    @Test
    public void shouldSetLeague() {
        String league = "BSA";

        Competition competition = builder
                .setLeague(league)
                .build();

        assertThat(competition.getLeague()).isEqualTo(league);
    }

    @Test
    public void shouldSetYear() {
        String year = "2017";

        Competition competition = builder
                .setYear(year)
                .build();

        assertThat(competition.getYear()).isEqualTo(year);
    }

    @Test
    public void shouldSetCurrentMatchDay() {
        int currentMatchDay = 12;

        Competition competition = builder
                .setCurrentMatchDay(currentMatchDay)
                .build();

        assertThat(competition.getCurrentMatchDay()).isEqualTo(currentMatchDay);
    }

    @Test
    public void shouldSetNumberOfMatchDays() {
        int numberOfMatchDays = 38;

        Competition competition = builder
                .setNumberOfMatchDays(numberOfMatchDays)
                .build();

        assertThat(competition.getNumberOfMatchDays()).isEqualTo(numberOfMatchDays);
    }

    @Test
    public void shouldSetNumberOfTeams() {
        int numberOfTeams = 20;

        Competition competition = builder
                .setNumberOfTeams(numberOfTeams)
                .build();

        assertThat(competition.getNumberOfTeams()).isEqualTo(numberOfTeams);
    }

    @Test
    public void shouldSetNumberOfGames() {
        int numberOfGames = 380;

        Competition competition = builder
                .setNumberOfGames(numberOfGames)
                .build();

        assertThat(competition.getNumberOfGames()).isEqualTo(numberOfGames);
    }

    @Test
    public void shouldSetLastUpdated() {
        LocalDateTime lastUpdated = LocalDateTime.now();

        Competition competition = builder
                .setLastUpdated(lastUpdated)
                .build();

        assertThat(competition.getLastUpdated()).isEqualTo(lastUpdated);
    }

}
