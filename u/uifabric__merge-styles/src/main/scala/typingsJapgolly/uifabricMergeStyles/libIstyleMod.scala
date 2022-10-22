package typingsJapgolly.uifabricMergeStyles

import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIstyleMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.uifabricMergeStyles.libIstyleMod.IStyleBase
    - typingsJapgolly.uifabricMergeStyles.libIstyleMod.IStyleBaseArray
  */
  type IStyle = js.UndefOr[_IStyle | String | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.uifabricMergeStyles.libIrawstyleMod.IRawStyle
    - java.lang.String
    - typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesBooleans.`false`
    - scala.Null
    - scala.Unit
  */
  type IStyleBase = js.UndefOr[_IStyleBase | String | Null]
  
  @js.native
  trait IStyleBaseArray
    extends StObject
       with Array[IStyle]
       with _IStyle
  
  trait _IStyle extends StObject
  
  trait _IStyleBase
    extends StObject
       with _IStyle
}
