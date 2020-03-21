package typingsJapgolly.showdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Showdown event listener.
    */
  type EventListener = js.Function5[
    /* evtName */ java.lang.String, 
    /* text */ java.lang.String, 
    /* converter */ typingsJapgolly.showdown.mod.Converter, 
    /* options */ typingsJapgolly.showdown.mod.ShowdownOptions, 
    /* globals */ typingsJapgolly.showdown.mod.ConverterGlobals, 
    scala.Unit | java.lang.String
  ]
  type Metadata = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Showdown extensions store object.
    */
  type ShowdownExtensions = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.showdown.mod.ShowdownExtension]]
  /**
    * Showdown options schema.
    */
  type ShowdownOptionsSchema = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.showdown.mod.ShowdownOptionDescription]
  /**
    * Showdown subParser.
    */
  type SubParser_ = js.Function1[/* repeated */ js.Any, java.lang.String]
}
