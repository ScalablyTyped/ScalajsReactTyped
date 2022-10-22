package typingsJapgolly.tablesorter

import typingsJapgolly.select2.mod.DataFormat
import typingsJapgolly.select2.mod.GroupedDataFormat
import typingsJapgolly.select2.mod.Options
import typingsJapgolly.tablesorter.filteringFormatterOptionsControlOptionsMod.ControlOptions
import typingsJapgolly.tablesorter.filteringFormatterOptionsDefaultValueOptionsMod.DefaultValueOptions
import typingsJapgolly.tablesorter.filteringFormatterOptionsStrictOptionsMod.StrictOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterOptionsSelect2OptionsMod {
  
  trait Select2Options
    extends StObject
       with Options[DataFormat | GroupedDataFormat, Any]
       with ControlOptions
       with StrictOptions
       with DefaultValueOptions[String]
  object Select2Options {
    
    inline def apply(): Select2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Select2Options]
    }
  }
}
