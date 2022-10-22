package typingsJapgolly.reactFileUtils

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.File
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactFileUtils.distComponentsFileIconFileIconSetV1Mod.IconPropsV1
import typingsJapgolly.reactFileUtils.distComponentsFileIconFileIconSetV2Mod.IconPropsV2
import typingsJapgolly.reactFileUtils.distComponentsFileIconMimeTypesMod.GeneralType
import typingsJapgolly.reactFileUtils.distComponentsFileIconMimeTypesMod.SupportedMimeType
import typingsJapgolly.reactFileUtils.reactFileUtilsStrings.fallback
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alt extends StObject {
    
    var alt: js.UndefOr[Record[SupportedMimeType | GeneralType | fallback, ComponentType[IconPropsV1]]] = js.undefined
    
    var standard: Record[SupportedMimeType | GeneralType | fallback, ComponentType[IconPropsV1]]
  }
  object Alt {
    
    inline def apply(standard: Record[SupportedMimeType | GeneralType | fallback, ComponentType[IconPropsV1]]): Alt = {
      val __obj = js.Dynamic.literal(standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alt]
    }
    
    extension [Self <: Alt](x: Self) {
      
      inline def setAlt(value: Record[SupportedMimeType | GeneralType | fallback, ComponentType[IconPropsV1]]): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setStandard(value: Record[SupportedMimeType | GeneralType | fallback, ComponentType[IconPropsV1]]): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictx
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object Dictx {
    
    inline def apply(): Dictx = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictx]
    }
    
    extension [Self <: Dictx](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var lastModified: js.UndefOr[Double] = js.undefined
    
    var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
    
    var name: String
    
    var size: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Height {
    
    inline def apply(name: String): Height = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LastModified extends StObject {
    
    var lastModified: js.UndefOr[Double] = js.undefined
    
    var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
    
    var name: String
    
    var size: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
  }
  object LastModified {
    
    inline def apply(name: String): LastModified = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastModified]
    }
    
    extension [Self <: LastModified](x: Self) {
      
      inline def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
  
  trait OnFileChange extends StObject {
    
    def onFileChange(files: js.Array[File]): Unit
    
    var resetOnChange: js.UndefOr[Boolean] = js.undefined
  }
  object OnFileChange {
    
    inline def apply(onFileChange: js.Array[File] => Callback): OnFileChange = {
      val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1((t0: js.Array[File]) => onFileChange(t0).runNow()))
      __obj.asInstanceOf[OnFileChange]
    }
    
    extension [Self <: OnFileChange](x: Self) {
      
      inline def setOnFileChange(value: js.Array[File] => Callback): Self = StObject.set(x, "onFileChange", js.Any.fromFunction1((t0: js.Array[File]) => value(t0).runNow()))
      
      inline def setResetOnChange(value: Boolean): Self = StObject.set(x, "resetOnChange", value.asInstanceOf[js.Any])
      
      inline def setResetOnChangeUndefined: Self = StObject.set(x, "resetOnChange", js.undefined)
    }
  }
  
  trait Standard extends StObject {
    
    var alt: js.UndefOr[Record[SupportedMimeType | GeneralType | fallback, ComponentType[IconPropsV2]]] = js.undefined
    
    var standard: Record[SupportedMimeType | GeneralType | fallback, ComponentType[IconPropsV2]]
  }
  object Standard {
    
    inline def apply(standard: Record[SupportedMimeType | GeneralType | fallback, ComponentType[IconPropsV2]]): Standard = {
      val __obj = js.Dynamic.literal(standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[Standard]
    }
    
    extension [Self <: Standard](x: Self) {
      
      inline def setAlt(value: Record[SupportedMimeType | GeneralType | fallback, ComponentType[IconPropsV2]]): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setStandard(value: Record[SupportedMimeType | GeneralType | fallback, ComponentType[IconPropsV2]]): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
}
