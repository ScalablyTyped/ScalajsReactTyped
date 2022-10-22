package typingsJapgolly.nivoColors

import typingsJapgolly.nivoColors.anon.Datum
import typingsJapgolly.nivoColors.anon.From
import typingsJapgolly.nivoColors.anon.Scheme
import typingsJapgolly.nivoColors.anon.Theme
import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPropsMod {
  
  @JSImport("@nivo/colors/dist/types/props", "inheritedColorPropType")
  @js.native
  val inheritedColorPropType: Requireable[String | (js.Function1[/* repeated */ Any, Any]) | (InferProps[From | Theme])] = js.native
  
  @JSImport("@nivo/colors/dist/types/props", "ordinalColorsPropType")
  @js.native
  val ordinalColorsPropType: Requireable[
    String | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]]) | (InferProps[Datum | Scheme])
  ] = js.native
}
