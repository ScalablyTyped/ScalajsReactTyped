package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardType extends StObject
@JSImport("azdata", "CardType")
@js.native
object CardType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CardType & String] = js.native
  
  @js.native
  sealed trait Details
    extends StObject
       with CardType
  /* "Details" */ val Details: typingsJapgolly.azdata.mod.CardType.Details & String = js.native
  
  /**
    * Card with the icon as a background image
    */
  @js.native
  sealed trait Image
    extends StObject
       with CardType
  /* "Image" */ val Image: typingsJapgolly.azdata.mod.CardType.Image & String = js.native
  
  @js.native
  sealed trait ListItem
    extends StObject
       with CardType
  /* "ListItem" */ val ListItem: typingsJapgolly.azdata.mod.CardType.ListItem & String = js.native
  
  @js.native
  sealed trait VerticalButton
    extends StObject
       with CardType
  /* "VerticalButton" */ val VerticalButton: typingsJapgolly.azdata.mod.CardType.VerticalButton & String = js.native
}
