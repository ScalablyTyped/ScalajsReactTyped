package typingsJapgolly.reactResizeDetector

import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactResizeDetector.buildResizeDetectorMod.ComponentsProps
import typingsJapgolly.reactResizeDetector.buildUseResizeDetectorMod.FunctionProps
import typingsJapgolly.reactResizeDetector.buildUseResizeDetectorMod.UseResizeDetectorReturn
import typingsJapgolly.reactResizeDetector.buildWithResizeDetectorMod.OptionalKey
import typingsJapgolly.reactResizeDetector.buildWithResizeDetectorMod.Without
import typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.height
import typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.targetRef
import typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-resize-detector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-resize-detector", JSImport.Default)
  @js.native
  open class default[ElementT /* <: HTMLElement */] protected ()
    extends typingsJapgolly.reactResizeDetector.buildResizeDetectorMod.default[ElementT] {
    def this(props: ComponentsProps[ElementT]) = this()
  }
  
  inline def useResizeDetector[T](): UseResizeDetectorReturn[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeDetector")().asInstanceOf[UseResizeDetectorReturn[T]]
  inline def useResizeDetector[T](props: FunctionProps): UseResizeDetectorReturn[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeDetector")(props.asInstanceOf[js.Any]).asInstanceOf[UseResizeDetectorReturn[T]]
  
  inline def withResizeDetector[P, ElementT /* <: HTMLElement */](ComponentInner: ComponentType[P]): ForwardRefExoticComponent[
    (PropsWithoutRef[Without[Without[OptionalKey[P, targetRef], width], height]]) & RefAttributes[HTMLElement]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withResizeDetector")(ComponentInner.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[Without[Without[OptionalKey[P, targetRef], width], height]]) & RefAttributes[HTMLElement]
  ]]
  inline def withResizeDetector[P, ElementT /* <: HTMLElement */](ComponentInner: ComponentType[P], options: ComponentsProps[ElementT]): ForwardRefExoticComponent[
    (PropsWithoutRef[Without[Without[OptionalKey[P, targetRef], width], height]]) & RefAttributes[HTMLElement]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withResizeDetector")(ComponentInner.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[Without[Without[OptionalKey[P, targetRef], width], height]]) & RefAttributes[HTMLElement]
  ]]
}
