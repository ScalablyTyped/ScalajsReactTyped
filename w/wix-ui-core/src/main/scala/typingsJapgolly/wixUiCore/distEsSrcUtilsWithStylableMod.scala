package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcUtilsWithStylableMod {
  
  @JSImport("wix-ui-core/dist/es/src/utils/withStylable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withStylable[CoreProps, ExtendedProps](
    Component: ComponentClassP[CoreProps & js.Object],
    stylesheet: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RuntimeStylesheet */ Any,
    getState: js.Function3[
      /* p */ js.UndefOr[Any], 
      /* s */ js.UndefOr[Any], 
      /* c */ js.UndefOr[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StateMap */ Any
    ]
  ): ComponentClassP[CoreProps & ExtendedProps & js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStylable")(Component.asInstanceOf[js.Any], stylesheet.asInstanceOf[js.Any], getState.asInstanceOf[js.Any])).asInstanceOf[ComponentClassP[CoreProps & ExtendedProps & js.Object]]
  inline def withStylable[CoreProps, ExtendedProps](
    Component: ComponentClassP[CoreProps & js.Object],
    stylesheet: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RuntimeStylesheet */ Any,
    getState: js.Function3[
      /* p */ js.UndefOr[Any], 
      /* s */ js.UndefOr[Any], 
      /* c */ js.UndefOr[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StateMap */ Any
    ],
    extendedDefaultProps: js.Object
  ): ComponentClassP[CoreProps & ExtendedProps & js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStylable")(Component.asInstanceOf[js.Any], stylesheet.asInstanceOf[js.Any], getState.asInstanceOf[js.Any], extendedDefaultProps.asInstanceOf[js.Any])).asInstanceOf[ComponentClassP[CoreProps & ExtendedProps & js.Object]]
  inline def withStylable[CoreProps, ExtendedProps](
    Component: FunctionComponent[CoreProps],
    stylesheet: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RuntimeStylesheet */ Any,
    getState: js.Function1[
      /* p */ js.UndefOr[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StateMap */ Any
    ]
  ): FunctionComponent[CoreProps & ExtendedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStylable")(Component.asInstanceOf[js.Any], stylesheet.asInstanceOf[js.Any], getState.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[CoreProps & ExtendedProps]]
  inline def withStylable[CoreProps, ExtendedProps](
    Component: FunctionComponent[CoreProps],
    stylesheet: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RuntimeStylesheet */ Any,
    getState: js.Function1[
      /* p */ js.UndefOr[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StateMap */ Any
    ],
    extendedDefaultProps: js.Object
  ): FunctionComponent[CoreProps & ExtendedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStylable")(Component.asInstanceOf[js.Any], stylesheet.asInstanceOf[js.Any], getState.asInstanceOf[js.Any], extendedDefaultProps.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[CoreProps & ExtendedProps]]
}
