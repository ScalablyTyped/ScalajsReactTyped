package typingsJapgolly.wordpressCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/compose", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // tslint:disable:no-unnecessary-generics
  // prettier-ignore
  def createHigherOrderComponent[EP](
    mapComponentToEnhancedComponent: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<any> */ /* component */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<any> */ _
    ],
    modifierName: String
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<any> */ /* component */ js.Any, 
    _
  ] = js.native
  def ifCondition[P](predicate: js.Function1[/* props */ P, Boolean]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<P> */ /* component */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FC<P> */ _
  ] = js.native
  // prettier-ignore
  def pure[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<any> */ js.Any */](component: T): js.Any = js.native
  def useMediaQuery(query: String): Boolean = js.native
  def useReducedMotion(): Boolean = js.native
  // prettier-ignore
  def withGlobalEvents(eventMapper: kinkeyofWindowEventMapstr): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentClass<any> */ /* component */ js.Any, 
    _
  ] = js.native
  // prettier-ignore
  def withInstanceId[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<any> */ js.Any */](wrapped: T): js.Any = js.native
  // prettier-ignore
  def withSafeTimeout[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<any> */ js.Any */](component: T): js.Any = js.native
  // prettier-ignore
  def withState[SP /* <: js.Object */](
    initialState: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof SP ]: SP[k]}
    */ typingsJapgolly.wordpressCompose.wordpressComposeStrings.withState with SP
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<any> */ /* component */ js.Any, 
    _
  ] = js.native
}

