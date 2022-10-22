package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseEnsuredRefMod {
  
  @JSImport("@react-md/utils/types/useEnsuredRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useEnsuredRef[E /* <: HTMLElement */](): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEnsuredRef")().asInstanceOf[EnsuredRefs[E]]
  inline def useEnsuredRef[E /* <: HTMLElement */](propRef: Ref[E | Null]): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEnsuredRef")(propRef.asInstanceOf[js.Any]).asInstanceOf[EnsuredRefs[E]]
  
  type EnsuredRefs[E /* <: HTMLElement */] = js.Tuple2[MutableRefObject[E | Null], RefFn[E | Null]]
}
