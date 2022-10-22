package typingsJapgolly.reactDndMultiBackend

import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactDnd.distHooksTypesMod.DragSourceHookSpec
import typingsJapgolly.reactDnd.distHooksTypesMod.DropTargetHookSpec
import typingsJapgolly.reactDndMultiBackend.distEsmComponentsDndProviderMod.DndProviderProps
import typingsJapgolly.reactDndMultiBackend.distEsmHooksUseMultiDragMod.useMultiDragState
import typingsJapgolly.reactDndMultiBackend.distEsmHooksUseMultiDropMod.useMultiDropState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmMod {
  
  @JSImport("react-dnd-multi-backend/dist/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DndProvider(hasPortalProps: DndProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DndProvider")(hasPortalProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object Preview {
    
    inline def apply[T, El /* <: org.scalajs.dom.Element */](
      props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PreviewProps<T, El> */ Any
    ): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("react-dnd-multi-backend/dist/esm", "Preview")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dnd-multi-backend/dist/esm", "Preview.Context")
    @js.native
    def Context: typingsJapgolly.react.mod.Context[
        js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PreviewState<unknown, Element> */ Any
        ]
      ] = js.native
    inline def Context_=(
      x: Context[
          js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PreviewState<unknown, Element> */ Any
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
  }
  
  inline def useMultiDrag[Drag, Drop, Props](spec: DragSourceHookSpec[Drag, Drop, Props]): useMultiDragState[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMultiDrag")(spec.asInstanceOf[js.Any]).asInstanceOf[useMultiDragState[Props]]
  
  inline def useMultiDrop[Drag, Drop, Props](spec: DropTargetHookSpec[Drag, Drop, Props]): useMultiDropState[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMultiDrop")(spec.asInstanceOf[js.Any]).asInstanceOf[useMultiDropState[Props]]
  
  inline def usePreview[T, El /* <: org.scalajs.dom.Element */](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreview")().asInstanceOf[Any]
}
