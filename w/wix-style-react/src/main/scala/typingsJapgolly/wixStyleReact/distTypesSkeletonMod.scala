package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonMod {
  
  @JSImport("wix-style-react/dist/types/Skeleton", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SkeletonProps, js.Object, Any]
  
  type Skeleton = PureComponent[SkeletonProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.start
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.middle
  */
  trait SkeletonAlignment extends StObject
  object SkeletonAlignment {
    
    inline def middle: typingsJapgolly.wixStyleReact.wixStyleReactStrings.middle = "middle".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.middle]
    
    inline def start: typingsJapgolly.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.start]
  }
  
  trait SkeletonContent extends StObject {
    
    var size: SkeletonContentSize
    
    var `type`: SkeletonContentType
  }
  object SkeletonContent {
    
    inline def apply(size: SkeletonContentSize, `type`: SkeletonContentType): SkeletonContent = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonContent]
    }
    
    extension [Self <: SkeletonContent](x: Self) {
      
      inline def setSize(value: SkeletonContentSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: SkeletonContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.full
  */
  trait SkeletonContentSize extends StObject
  object SkeletonContentSize {
    
    inline def full: typingsJapgolly.wixStyleReact.wixStyleReactStrings.full = "full".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.full]
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
  }
  
  type SkeletonContentType = line
  
  trait SkeletonProps extends StObject {
    
    var alignment: js.UndefOr[SkeletonAlignment] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.Array[SkeletonContent]
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var spacing: js.UndefOr[SkeletonSpacing] = js.undefined
  }
  object SkeletonProps {
    
    inline def apply(content: js.Array[SkeletonContent]): SkeletonProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonProps]
    }
    
    extension [Self <: SkeletonProps](x: Self) {
      
      inline def setAlignment(value: SkeletonAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: js.Array[SkeletonContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: SkeletonContent*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setSpacing(value: SkeletonSpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
  */
  trait SkeletonSpacing extends StObject
  object SkeletonSpacing {
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
  }
}
