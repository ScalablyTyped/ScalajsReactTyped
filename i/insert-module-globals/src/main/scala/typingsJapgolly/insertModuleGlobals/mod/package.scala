package typingsJapgolly.insertModuleGlobals

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InsertFunction = js.Function2[
    /* file */ java.lang.String, 
    /* basedir */ java.lang.String, 
    typingsJapgolly.insertModuleGlobals.mod.VariableConfig | java.lang.String
  ]
  type VarsOption = org.scalablytyped.runtime.StringDictionary[js.UndefOr[typingsJapgolly.insertModuleGlobals.mod.InsertFunction]]
}
