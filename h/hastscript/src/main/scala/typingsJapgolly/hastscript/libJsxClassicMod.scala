package typingsJapgolly.hastscript

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hastscript.anon.`0`
import typingsJapgolly.hastscript.libCoreMod.HProperties
import typingsJapgolly.hastscript.libCoreMod.HResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsxClassicMod {
  
  /**
    * This unique symbol is declared to specify the key on which JSX children are passed, without conflicting
    * with the Attributes type.
    */
  @JSImport("hastscript/lib/jsx-classic", "children")
  @js.native
  val children: js.Symbol = js.native
  
  type Element = HResult
  
  @js.native
  trait ElementChildrenAttribute extends StObject
  
  type IntrinsicAttributes = scala.Nothing
  
  type IntrinsicElements = StringDictionary[HProperties | `0`]
}
