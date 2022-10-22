package typingsJapgolly.reactVega

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  type PlainObject = StringDictionary[Any]
  
  type SignalListener = js.Function2[/* name */ String, /* value */ Any, Unit]
  
  type SignalListeners = StringDictionary[SignalListener]
  
  type View = typingsJapgolly.vega.mod.View
  
  type ViewListener = js.Function1[/* view */ View, Unit]
}
