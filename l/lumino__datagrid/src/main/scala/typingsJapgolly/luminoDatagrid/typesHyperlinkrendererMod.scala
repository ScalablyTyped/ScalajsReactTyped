package typingsJapgolly.luminoDatagrid

import typingsJapgolly.luminoDatagrid.typesCellrendererMod.CellRenderer.CellConfig
import typingsJapgolly.luminoDatagrid.typesCellrendererMod.CellRenderer.ConfigOption
import typingsJapgolly.luminoDatagrid.typesHyperlinkrendererMod.HyperlinkRenderer.IOptions
import typingsJapgolly.luminoDatagrid.typesTextrendererMod.TextRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHyperlinkrendererMod {
  
  @JSImport("@lumino/datagrid/types/hyperlinkrenderer", "HyperlinkRenderer")
  @js.native
  /**
    * Construct a new text renderer.
    *
    * @param options - The options for initializing the renderer.
    */
  open class HyperlinkRenderer () extends TextRenderer {
    def this(options: IOptions) = this()
    
    /**
      * The URL address.
      */
    val url: js.UndefOr[ConfigOption[String]] = js.native
    
    /**
      * The friendly link name.
      */
    val urlName: js.UndefOr[ConfigOption[String]] = js.native
  }
  object HyperlinkRenderer {
    
    /**
      * A type alias for the supported ellipsis sides.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.left
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.right
    */
    trait ElideDirection extends StObject
    object ElideDirection {
      
      inline def left: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.left = "left".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.left]
      
      inline def right: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.right = "right".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.right]
    }
    
    /**
      * A type alias for the supported horizontal alignment modes.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.left
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.center
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.right
    */
    trait HorizontalAlignment extends StObject
    object HorizontalAlignment {
      
      inline def center: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.center = "center".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.center]
      
      inline def left: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.left = "left".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.left]
      
      inline def right: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.right = "right".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.right]
    }
    
    /**
      * An options object for initializing a text renderer.
      */
    trait IOptions
      extends StObject
         with typingsJapgolly.luminoDatagrid.typesTextrendererMod.TextRenderer.IOptions {
      
      /**
        * The URL address
        */
      var url: js.UndefOr[ConfigOption[String]] = js.undefined
      
      /**
        * The friendly link name.
        *
        * The default is the URL itself.
        */
      var urlName: js.UndefOr[ConfigOption[String]] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setUrl(value: ConfigOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlFunction1(value: /* config */ CellConfig => String): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
        
        inline def setUrlName(value: ConfigOption[String]): Self = StObject.set(x, "urlName", value.asInstanceOf[js.Any])
        
        inline def setUrlNameFunction1(value: /* config */ CellConfig => String): Self = StObject.set(x, "urlName", js.Any.fromFunction1(value))
        
        inline def setUrlNameUndefined: Self = StObject.set(x, "urlName", js.undefined)
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    /**
      * A type alias for the supported vertical alignment modes.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.top
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.center
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.bottom
    */
    trait VerticalAlignment extends StObject
    object VerticalAlignment {
      
      inline def bottom: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.bottom]
      
      inline def center: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.center = "center".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.center]
      
      inline def top: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.top = "top".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.top]
    }
  }
}
