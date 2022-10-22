package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextType extends StObject
@JSImport("azdata", "TextType")
@js.native
object TextType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextType & String] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with TextType
  /* "Error" */ val Error: typingsJapgolly.azdata.mod.TextType.Error & String = js.native
  
  @js.native
  sealed trait Normal
    extends StObject
       with TextType
  /* "Normal" */ val Normal: typingsJapgolly.azdata.mod.TextType.Normal & String = js.native
  
  @js.native
  sealed trait OrderedList
    extends StObject
       with TextType
  /* "OrderedList" */ val OrderedList: typingsJapgolly.azdata.mod.TextType.OrderedList & String = js.native
  
  @js.native
  sealed trait UnorderedList
    extends StObject
       with TextType
  /* "UnorderedList" */ val UnorderedList: typingsJapgolly.azdata.mod.TextType.UnorderedList & String = js.native
}
