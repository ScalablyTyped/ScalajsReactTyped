package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDirMod {
  
  @JSImport("@react-md/utils/types/Dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DEFAULT_DIR(): WritingDirection = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_DIR")().asInstanceOf[WritingDirection]
  
  inline def Dir(hasChildrenDefaultDir: DirProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Dir")(hasChildrenDefaultDir.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useDir(): WritingDirectionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useDir")().asInstanceOf[WritingDirectionContext]
  
  trait DirProps extends StObject {
    
    /**
      * A single ReactElement child. If the `Dir` has a parent `Dir`, the child
      * will have the `dir` prop cloned into this element.
      */
    var children: Element
    
    /**
      * The default writing direction for your app or a subtree. To change the
      * current writing direction, use the `useDir` hook to get access to the
      * current `dir` and the `toggleDir` function.
      */
    var defaultDir: js.UndefOr[WritingDirection | js.Function0[WritingDirection]] = js.undefined
  }
  object DirProps {
    
    inline def apply(children: VdomElement): DirProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirProps]
    }
    
    extension [Self <: DirProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultDir(value: WritingDirection | js.Function0[WritingDirection]): Self = StObject.set(x, "defaultDir", value.asInstanceOf[js.Any])
      
      inline def setDefaultDirCallbackTo(value: CallbackTo[WritingDirection]): Self = StObject.set(x, "defaultDir", value.toJsFn)
      
      inline def setDefaultDirUndefined: Self = StObject.set(x, "defaultDir", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdUtils.reactMdUtilsStrings.ltr
    - typingsJapgolly.reactMdUtils.reactMdUtilsStrings.rtl
  */
  trait WritingDirection extends StObject
  object WritingDirection {
    
    inline def ltr: typingsJapgolly.reactMdUtils.reactMdUtilsStrings.ltr = "ltr".asInstanceOf[typingsJapgolly.reactMdUtils.reactMdUtilsStrings.ltr]
    
    inline def rtl: typingsJapgolly.reactMdUtils.reactMdUtilsStrings.rtl = "rtl".asInstanceOf[typingsJapgolly.reactMdUtils.reactMdUtilsStrings.rtl]
  }
  
  trait WritingDirectionContext extends StObject {
    
    /**
      * The current writing direction that is being inherited.
      */
    var dir: WritingDirection
    
    /**
      * Toggles the current writing direction for the first parent `Dir` component.
      */
    def toggleDir(): Unit
  }
  object WritingDirectionContext {
    
    inline def apply(dir: WritingDirection, toggleDir: Callback): WritingDirectionContext = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], toggleDir = toggleDir.toJsFn)
      __obj.asInstanceOf[WritingDirectionContext]
    }
    
    extension [Self <: WritingDirectionContext](x: Self) {
      
      inline def setDir(value: WritingDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setToggleDir(value: Callback): Self = StObject.set(x, "toggleDir", value.toJsFn)
    }
  }
}
