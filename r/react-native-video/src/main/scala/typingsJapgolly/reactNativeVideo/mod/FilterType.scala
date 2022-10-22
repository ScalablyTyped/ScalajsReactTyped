package typingsJapgolly.reactNativeVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterType extends StObject
@JSImport("react-native-video", "FilterType")
@js.native
object FilterType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterType & String] = js.native
  
  @js.native
  sealed trait CHROME
    extends StObject
       with FilterType
  /* "CIPhotoEffectChrome" */ val CHROME: typingsJapgolly.reactNativeVideo.mod.FilterType.CHROME & String = js.native
  
  @js.native
  sealed trait FADE
    extends StObject
       with FilterType
  /* "CIPhotoEffectFade" */ val FADE: typingsJapgolly.reactNativeVideo.mod.FilterType.FADE & String = js.native
  
  @js.native
  sealed trait FALSE
    extends StObject
       with FilterType
  /* "CIFalseColor" */ val FALSE: typingsJapgolly.reactNativeVideo.mod.FilterType.FALSE & String = js.native
  
  @js.native
  sealed trait INSTANT
    extends StObject
       with FilterType
  /* "CIPhotoEffectInstant" */ val INSTANT: typingsJapgolly.reactNativeVideo.mod.FilterType.INSTANT & String = js.native
  
  @js.native
  sealed trait INVERT
    extends StObject
       with FilterType
  /* "CIColorInvert" */ val INVERT: typingsJapgolly.reactNativeVideo.mod.FilterType.INVERT & String = js.native
  
  @js.native
  sealed trait MAXIMUMCOMPONENT
    extends StObject
       with FilterType
  /* "CIMaximumComponent" */ val MAXIMUMCOMPONENT: typingsJapgolly.reactNativeVideo.mod.FilterType.MAXIMUMCOMPONENT & String = js.native
  
  @js.native
  sealed trait MINIMUMCOMPONENT
    extends StObject
       with FilterType
  /* "CIMinimumComponent" */ val MINIMUMCOMPONENT: typingsJapgolly.reactNativeVideo.mod.FilterType.MINIMUMCOMPONENT & String = js.native
  
  @js.native
  sealed trait MONO
    extends StObject
       with FilterType
  /* "CIPhotoEffectMono" */ val MONO: typingsJapgolly.reactNativeVideo.mod.FilterType.MONO & String = js.native
  
  @js.native
  sealed trait MONOCHROME
    extends StObject
       with FilterType
  /* "CIColorMonochrome" */ val MONOCHROME: typingsJapgolly.reactNativeVideo.mod.FilterType.MONOCHROME & String = js.native
  
  @js.native
  sealed trait NOIR
    extends StObject
       with FilterType
  /* "CIPhotoEffectNoir" */ val NOIR: typingsJapgolly.reactNativeVideo.mod.FilterType.NOIR & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with FilterType
  /* "" */ val NONE: typingsJapgolly.reactNativeVideo.mod.FilterType.NONE & String = js.native
  
  @js.native
  sealed trait POSTERIZE
    extends StObject
       with FilterType
  /* "CIColorPosterize" */ val POSTERIZE: typingsJapgolly.reactNativeVideo.mod.FilterType.POSTERIZE & String = js.native
  
  @js.native
  sealed trait PROCESS
    extends StObject
       with FilterType
  /* "CIPhotoEffectProcess" */ val PROCESS: typingsJapgolly.reactNativeVideo.mod.FilterType.PROCESS & String = js.native
  
  @js.native
  sealed trait SEPIA
    extends StObject
       with FilterType
  /* "CISepiaTone" */ val SEPIA: typingsJapgolly.reactNativeVideo.mod.FilterType.SEPIA & String = js.native
  
  @js.native
  sealed trait TONAL
    extends StObject
       with FilterType
  /* "CIPhotoEffectTonal" */ val TONAL: typingsJapgolly.reactNativeVideo.mod.FilterType.TONAL & String = js.native
  
  @js.native
  sealed trait TRANSFER
    extends StObject
       with FilterType
  /* "CIPhotoEffectTransfer" */ val TRANSFER: typingsJapgolly.reactNativeVideo.mod.FilterType.TRANSFER & String = js.native
}
