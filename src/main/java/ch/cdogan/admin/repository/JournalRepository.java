package ch.cdogan.admin.repository;

import ch.cdogan.admin.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.cdogan.admin.domain.Journal;



public interface JournalRepository extends JpaRepository<Journal, Long> {

    /*
    *  you can use this conventions
    *  (Create, Read, Update, Delete)
    *  findByTitleLike or findBySummary or even
    *  findByTitleAndSummaryIgnoringCase .
    *
    */



}
