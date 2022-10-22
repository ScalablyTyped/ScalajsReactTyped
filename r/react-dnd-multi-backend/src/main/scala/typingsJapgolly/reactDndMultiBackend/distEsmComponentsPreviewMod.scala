package typingsJapgolly.reactDndMultiBackend

import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmComponentsPreviewMod {
  
  object Preview {
    
    inline def apply[T, El /* <: Element */](
      props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PreviewProps<T, El> */ Any
    ): typingsJapgolly.react.mod.global.JSX.Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element | Null]
    
    @JSImport("react-dnd-multi-backend/dist/esm/components/Preview", "Preview")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dnd-multi-backend/dist/esm/components/Preview", "Preview.Context")
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
}
