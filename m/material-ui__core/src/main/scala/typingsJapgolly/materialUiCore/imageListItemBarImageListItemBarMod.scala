package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiCore.anon.PartialClassNameMapImageL
import typingsJapgolly.materialUiCore.materialUiCoreStrings.bottom
import typingsJapgolly.materialUiCore.materialUiCoreStrings.left
import typingsJapgolly.materialUiCore.materialUiCoreStrings.right
import typingsJapgolly.materialUiCore.materialUiCoreStrings.top
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListItemBarImageListItemBarMod {
  
  @JSImport("@material-ui/core/ImageListItemBar/ImageListItemBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ImageListItemBarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.positionBottom
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.positionTop
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.rootSubtitle
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.titleWrap
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.titleWrapActionPosLeft
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.titleWrapActionPosRight
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.title
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.subtitle
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.actionIcon
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.actionIconActionPosLeft
  */
  trait ImageListItemBarClassKey extends StObject
  object ImageListItemBarClassKey {
    
    inline def actionIcon: typingsJapgolly.materialUiCore.materialUiCoreStrings.actionIcon = "actionIcon".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.actionIcon]
    
    inline def actionIconActionPosLeft: typingsJapgolly.materialUiCore.materialUiCoreStrings.actionIconActionPosLeft = "actionIconActionPosLeft".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.actionIconActionPosLeft]
    
    inline def positionBottom: typingsJapgolly.materialUiCore.materialUiCoreStrings.positionBottom = "positionBottom".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.positionBottom]
    
    inline def positionTop: typingsJapgolly.materialUiCore.materialUiCoreStrings.positionTop = "positionTop".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.positionTop]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def rootSubtitle: typingsJapgolly.materialUiCore.materialUiCoreStrings.rootSubtitle = "rootSubtitle".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.rootSubtitle]
    
    inline def subtitle: typingsJapgolly.materialUiCore.materialUiCoreStrings.subtitle = "subtitle".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.subtitle]
    
    inline def title: typingsJapgolly.materialUiCore.materialUiCoreStrings.title = "title".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.title]
    
    inline def titleWrap: typingsJapgolly.materialUiCore.materialUiCoreStrings.titleWrap = "titleWrap".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.titleWrap]
    
    inline def titleWrapActionPosLeft: typingsJapgolly.materialUiCore.materialUiCoreStrings.titleWrapActionPosLeft = "titleWrapActionPosLeft".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.titleWrapActionPosLeft]
    
    inline def titleWrapActionPosRight: typingsJapgolly.materialUiCore.materialUiCoreStrings.titleWrapActionPosRight = "titleWrapActionPosRight".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.titleWrapActionPosRight]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/ImageListItemBar/ImageListItemBar.ImageListItemBarClassKey, never> */
  trait ImageListItemBarProps extends StObject {
    
    /**
      * An IconButton element to be used as secondary action target
      * (primary action target is the item itself).
      */
    var actionIcon: js.UndefOr[Node] = js.undefined
    
    /**
      * Position of secondary action IconButton.
      */
    var actionPosition: js.UndefOr[left | right] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[PartialClassNameMapImageL] = js.undefined
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    /**
      * Position of the title bar.
      */
    var position: js.UndefOr[top | bottom] = js.undefined
    
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * String or element serving as subtitle (support text).
      */
    var subtitle: js.UndefOr[Node] = js.undefined
    
    /**
      * Title to be displayed on item.
      */
    var title: js.UndefOr[Node] = js.undefined
    
    /**
      * Position of the title bar.
      * @deprecated Use position instead.
      */
    var titlePosition: js.UndefOr[top | bottom] = js.undefined
  }
  object ImageListItemBarProps {
    
    inline def apply(): ImageListItemBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageListItemBarProps]
    }
    
    extension [Self <: ImageListItemBarProps](x: Self) {
      
      inline def setActionIcon(value: VdomNode): Self = StObject.set(x, "actionIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setActionIconNull: Self = StObject.set(x, "actionIcon", null)
      
      inline def setActionIconUndefined: Self = StObject.set(x, "actionIcon", js.undefined)
      
      inline def setActionIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "actionIcon", js.Array(value*))
      
      inline def setActionIconVdomElement(value: VdomElement): Self = StObject.set(x, "actionIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setActionPosition(value: left | right): Self = StObject.set(x, "actionPosition", value.asInstanceOf[js.Any])
      
      inline def setActionPositionUndefined: Self = StObject.set(x, "actionPosition", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: PartialClassNameMapImageL): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setPosition(value: top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubtitle(value: VdomNode): Self = StObject.set(x, "subtitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSubtitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "subtitle", js.Array(value*))
      
      inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitlePosition(value: top | bottom): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
      
      inline def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
