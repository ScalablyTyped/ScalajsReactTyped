package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormRegionStartup extends StObject {
  
  def BeforeFormRegionShow(FormRegion: FormRegion): Unit
  
  def GetFormRegionIcon(FormRegionName: String, LCID: Double, Icon: OlFormRegionIcon): Any
  
  def GetFormRegionManifest(FormRegionName: String, LCID: Double): Any
  
  def GetFormRegionStorage(
    FormRegionName: String,
    Item: Any,
    LCID: Double,
    FormRegionMode: OlFormRegionMode,
    FormRegionSize: OlFormRegionSize
  ): Any
  
  /* private */ @JSName("Outlook.FormRegionStartup_typekey")
  var OutlookDotFormRegionStartup_typekey: FormRegionStartup
}
object FormRegionStartup {
  
  inline def apply(
    BeforeFormRegionShow: FormRegion => Callback,
    GetFormRegionIcon: (String, Double, OlFormRegionIcon) => Any,
    GetFormRegionManifest: (String, Double) => Any,
    GetFormRegionStorage: (String, Any, Double, OlFormRegionMode, OlFormRegionSize) => Any,
    OutlookDotFormRegionStartup_typekey: FormRegionStartup
  ): FormRegionStartup = {
    val __obj = js.Dynamic.literal(BeforeFormRegionShow = js.Any.fromFunction1((t0: FormRegion) => BeforeFormRegionShow(t0).runNow()), GetFormRegionIcon = js.Any.fromFunction3(GetFormRegionIcon), GetFormRegionManifest = js.Any.fromFunction2(GetFormRegionManifest), GetFormRegionStorage = js.Any.fromFunction5(GetFormRegionStorage))
    __obj.updateDynamic("Outlook.FormRegionStartup_typekey")(OutlookDotFormRegionStartup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormRegionStartup]
  }
  
  extension [Self <: FormRegionStartup](x: Self) {
    
    inline def setBeforeFormRegionShow(value: FormRegion => Callback): Self = StObject.set(x, "BeforeFormRegionShow", js.Any.fromFunction1((t0: FormRegion) => value(t0).runNow()))
    
    inline def setGetFormRegionIcon(value: (String, Double, OlFormRegionIcon) => Any): Self = StObject.set(x, "GetFormRegionIcon", js.Any.fromFunction3(value))
    
    inline def setGetFormRegionManifest(value: (String, Double) => Any): Self = StObject.set(x, "GetFormRegionManifest", js.Any.fromFunction2(value))
    
    inline def setGetFormRegionStorage(value: (String, Any, Double, OlFormRegionMode, OlFormRegionSize) => Any): Self = StObject.set(x, "GetFormRegionStorage", js.Any.fromFunction5(value))
    
    inline def setOutlookDotFormRegionStartup_typekey(value: FormRegionStartup): Self = StObject.set(x, "Outlook.FormRegionStartup_typekey", value.asInstanceOf[js.Any])
  }
}
