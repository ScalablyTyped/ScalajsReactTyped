package typingsJapgolly.reactFileUtils

import typingsJapgolly.reactFileUtils.anon.Alt
import typingsJapgolly.reactFileUtils.anon.Standard
import typingsJapgolly.reactFileUtils.distComponentsFileIconFileIconSetV1Mod.IconPropsV1
import typingsJapgolly.reactFileUtils.distComponentsFileIconFileIconSetV2Mod.IconPropsV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsFileIconIconMapMod {
  
  @JSImport("react-file-utils/dist/components/FileIcon/iconMap", "iconMap")
  @js.native
  val iconMap: IconMap_ = js.native
  
  /* Inlined {[ v in react-file-utils.react-file-utils/dist/components/FileIcon/iconMap.IconVersion ]: {  standard :std.Record<react-file-utils.react-file-utils/dist/components/FileIcon/mimeTypes.SupportedMimeType | react-file-utils.react-file-utils/dist/components/FileIcon/mimeTypes.GeneralType | 'fallback', react.react.ComponentType<react-file-utils.react-file-utils/dist/components/FileIcon/iconMap.IconProps[v]>>,   alt :std.Record<react-file-utils.react-file-utils/dist/components/FileIcon/mimeTypes.SupportedMimeType | react-file-utils.react-file-utils/dist/components/FileIcon/mimeTypes.GeneralType | 'fallback', react.react.ComponentType<react-file-utils.react-file-utils/dist/components/FileIcon/iconMap.IconProps[v]>> | undefined}} */
  trait IconMap_ extends StObject {
    
    var `1`: Alt
    
    var `2`: Standard
  }
  object IconMap_ {
    
    inline def apply(`1`: Alt, `2`: Standard): IconMap_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconMap_]
    }
    
    extension [Self <: IconMap_](x: Self) {
      
      inline def set1(value: Alt): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: Standard): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconProps extends StObject {
    
    var `1`: IconPropsV1
    
    var `2`: IconPropsV2
  }
  object IconProps {
    
    inline def apply(`1`: IconPropsV1, `2`: IconPropsV2): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def set1(value: IconPropsV1): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: IconPropsV2): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactFileUtils.reactFileUtilsStrings.standard
    - typingsJapgolly.reactFileUtils.reactFileUtilsStrings.alt
  */
  trait IconType extends StObject
  object IconType {
    
    inline def alt: typingsJapgolly.reactFileUtils.reactFileUtilsStrings.alt = "alt".asInstanceOf[typingsJapgolly.reactFileUtils.reactFileUtilsStrings.alt]
    
    inline def standard: typingsJapgolly.reactFileUtils.reactFileUtilsStrings.standard = "standard".asInstanceOf[typingsJapgolly.reactFileUtils.reactFileUtilsStrings.standard]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactFileUtils.reactFileUtilsStrings.`1`
    - typingsJapgolly.reactFileUtils.reactFileUtilsStrings.`2`
  */
  trait IconVersion extends StObject
  object IconVersion {
    
    inline def `1`: typingsJapgolly.reactFileUtils.reactFileUtilsStrings.`1` = "1".asInstanceOf[typingsJapgolly.reactFileUtils.reactFileUtilsStrings.`1`]
    
    inline def `2`: typingsJapgolly.reactFileUtils.reactFileUtilsStrings.`2` = "2".asInstanceOf[typingsJapgolly.reactFileUtils.reactFileUtilsStrings.`2`]
  }
}
