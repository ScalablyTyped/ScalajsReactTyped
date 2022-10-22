package typingsJapgolly.uifabricUtilities

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCssMod {
  
  @JSImport("@uifabric/utilities/lib/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def css(args: ICssInput*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  type ICssInput = js.UndefOr[String | ISerializableObject | IDictionary | Null | Boolean]
  
  type IDictionary = StringDictionary[Boolean]
  
  trait ISerializableObject extends StObject {
    
    @JSName("toString")
    var toString_FISerializableObject: js.UndefOr[js.Function0[String]] = js.undefined
  }
  object ISerializableObject {
    
    inline def apply(): ISerializableObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISerializableObject]
    }
    
    extension [Self <: ISerializableObject](x: Self) {
      
      inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
      
      inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    }
  }
}
