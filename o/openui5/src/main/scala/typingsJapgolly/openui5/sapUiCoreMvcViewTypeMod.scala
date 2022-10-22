package typingsJapgolly.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreMvcViewTypeMod {
  
  /**
    * Specifies possible view types.
    *
    * **Note:** Typed views do not rely on a `ViewType`, it must be omitted in the view settings.
    */
  @JSImport("sap/ui/core/mvc/ViewType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ViewType & String] = js.native
    
    /* "HTML" */ val HTML: typingsJapgolly.openui5.sapUiCoreMvcViewTypeMod.ViewType.HTML & String = js.native
    
    /* "JS" */ val JS: typingsJapgolly.openui5.sapUiCoreMvcViewTypeMod.ViewType.JS & String = js.native
    
    /* "JSON" */ val JSON: typingsJapgolly.openui5.sapUiCoreMvcViewTypeMod.ViewType.JSON & String = js.native
    
    /* "Template" */ val Template: typingsJapgolly.openui5.sapUiCoreMvcViewTypeMod.ViewType.Template & String = js.native
    
    /* "XML" */ val XML: typingsJapgolly.openui5.sapUiCoreMvcViewTypeMod.ViewType.XML & String = js.native
  }
  
  @js.native
  sealed trait ViewType extends StObject
  /**
    * Specifies possible view types.
    *
    * **Note:** Typed views do not rely on a `ViewType`, it must be omitted in the view settings.
    */
  @JSImport("sap/ui/core/mvc/ViewType", "ViewType")
  @js.native
  object ViewType extends StObject {
    
    /**
      * HTML view
      */
    @js.native
    sealed trait HTML
      extends StObject
         with ViewType
    
    /**
      * @deprecated (since 1.90)
      *
      * JS View
      */
    @js.native
    sealed trait JS
      extends StObject
         with ViewType
    
    /**
      * JSON View
      */
    @js.native
    sealed trait JSON
      extends StObject
         with ViewType
    
    /**
      * @deprecated (since 1.56)
      *
      * Template View
      */
    @js.native
    sealed trait Template
      extends StObject
         with ViewType
    
    /**
      * XML view
      */
    @js.native
    sealed trait XML
      extends StObject
         with ViewType
  }
}
