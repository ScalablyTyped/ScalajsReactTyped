package typingsJapgolly.ionic.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionic.definitionsMod.APIResponseSuccess
import typingsJapgolly.ionic.definitionsMod.App
import typingsJapgolly.ionic.definitionsMod.PaginatorGuard
import typingsJapgolly.ionic.definitionsMod.PaginatorRequestGenerator
import typingsJapgolly.ionic.definitionsMod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ionic.ionic/definitions.PaginateArgs<ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.App>>>> */
trait PartialPaginateArgsRespon extends StObject {
  
  var guard: js.UndefOr[PaginatorGuard[Response[js.Array[App]]]] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var reqgen: js.UndefOr[PaginatorRequestGenerator] = js.undefined
  
  var state: js.UndefOr[PartialPaginatorState] = js.undefined
}
object PartialPaginateArgsRespon {
  
  inline def apply(): PartialPaginateArgsRespon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaginateArgsRespon]
  }
  
  extension [Self <: PartialPaginateArgsRespon](x: Self) {
    
    inline def setGuard(value: /* res */ APIResponseSuccess => /* is T */ Boolean): Self = StObject.set(x, "guard", js.Any.fromFunction1(value))
    
    inline def setGuardUndefined: Self = StObject.set(x, "guard", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setReqgen(value: CallbackTo[js.Promise[Req]]): Self = StObject.set(x, "reqgen", value.toJsFn)
    
    inline def setReqgenUndefined: Self = StObject.set(x, "reqgen", js.undefined)
    
    inline def setState(value: PartialPaginatorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
