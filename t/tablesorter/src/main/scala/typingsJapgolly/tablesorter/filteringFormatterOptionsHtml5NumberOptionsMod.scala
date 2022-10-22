package typingsJapgolly.tablesorter

import typingsJapgolly.tablesorter.filteringFormatterOptionsComparableOptionsMod.ComparableOptions
import typingsJapgolly.tablesorter.filteringFormatterOptionsControlOptionsMod.ControlOptions
import typingsJapgolly.tablesorter.filteringFormatterOptionsDefaultValueOptionsMod.DefaultValueOptions
import typingsJapgolly.tablesorter.filteringFormatterOptionsDelayableOptionsMod.DelayableOptions
import typingsJapgolly.tablesorter.filteringFormatterOptionsIntervalOptionsMod.IntervalOptions
import typingsJapgolly.tablesorter.filteringFormatterOptionsStrictOptionsMod.StrictOptions
import typingsJapgolly.tablesorter.filteringFormatterOptionsTestableOptionsMod.TestableOptions
import typingsJapgolly.tablesorter.filteringFormatterOptionsToggleableOptionsMod.ToggleableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterOptionsHtml5NumberOptionsMod {
  
  trait Html5NumberOptions
    extends StObject
       with IntervalOptions
       with ControlOptions
       with DefaultValueOptions[Double]
       with ComparableOptions
       with ToggleableOptions
       with DelayableOptions
       with StrictOptions
       with TestableOptions
  object Html5NumberOptions {
    
    inline def apply(): Html5NumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Html5NumberOptions]
    }
  }
}
