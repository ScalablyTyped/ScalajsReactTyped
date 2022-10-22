package typingsJapgolly.orbitUiReactComponents

import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcOmitPropsMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/omitProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def omitProps[TObject /* <: Record[String, Any] */, TKey /* <: String */](obj: TObject, omit: js.Array[TKey]): Omit[TObject, TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("omitProps")(obj.asInstanceOf[js.Any], omit.asInstanceOf[js.Any])).asInstanceOf[Omit[TObject, TKey]]
}
