package typingsJapgolly.dashjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLMediaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectionController extends StObject {
  
  def clearMediaInfoArray(): Unit
  
  def closeKeySession(session: SessionToken): Unit
  
  def createKeySession(ksInfo: KeySystemInfo): Unit
  
  def getKeySystems(): js.Array[KeySystem]
  
  def getSupportedKeySystemsFromContentProtection(cps: js.Array[Any]): js.Array[KeySystemInfo]
  
  def initializeForMedia(mediaInfo: ProtectionMediaInfo): Unit
  
  def loadKeySession(ksInfo: KeySystemInfo): Unit
  
  def removeKeySession(session: SessionToken): Unit
  
  def reset(): Unit
  
  def setKeySystems(keySystems: js.Array[KeySystem]): Unit
  
  def setLicenseRequestFilters(filters: js.Array[RequestFilter]): Unit
  
  def setLicenseResponseFilters(filters: js.Array[ResponseFilter]): Unit
  
  def setMediaElement(element: HTMLMediaElement): Unit
  
  def setProtectionData(protDataSet: ProtectionDataSet): Unit
  
  def setRobustnessLevel(level: String): Unit
  
  def setServerCertificate(serverCertificate: js.typedarray.ArrayBuffer): Unit
  
  def setSessionType(`type`: String): Unit
  
  def stop(): Unit
}
object ProtectionController {
  
  inline def apply(
    clearMediaInfoArray: Callback,
    closeKeySession: SessionToken => Callback,
    createKeySession: KeySystemInfo => Callback,
    getKeySystems: CallbackTo[js.Array[KeySystem]],
    getSupportedKeySystemsFromContentProtection: js.Array[Any] => js.Array[KeySystemInfo],
    initializeForMedia: ProtectionMediaInfo => Callback,
    loadKeySession: KeySystemInfo => Callback,
    removeKeySession: SessionToken => Callback,
    reset: Callback,
    setKeySystems: js.Array[KeySystem] => Callback,
    setLicenseRequestFilters: js.Array[RequestFilter] => Callback,
    setLicenseResponseFilters: js.Array[ResponseFilter] => Callback,
    setMediaElement: HTMLMediaElement => Callback,
    setProtectionData: ProtectionDataSet => Callback,
    setRobustnessLevel: String => Callback,
    setServerCertificate: js.typedarray.ArrayBuffer => Callback,
    setSessionType: String => Callback,
    stop: Callback
  ): ProtectionController = {
    val __obj = js.Dynamic.literal(clearMediaInfoArray = clearMediaInfoArray.toJsFn, closeKeySession = js.Any.fromFunction1((t0: SessionToken) => closeKeySession(t0).runNow()), createKeySession = js.Any.fromFunction1((t0: KeySystemInfo) => createKeySession(t0).runNow()), getKeySystems = getKeySystems.toJsFn, getSupportedKeySystemsFromContentProtection = js.Any.fromFunction1(getSupportedKeySystemsFromContentProtection), initializeForMedia = js.Any.fromFunction1((t0: ProtectionMediaInfo) => initializeForMedia(t0).runNow()), loadKeySession = js.Any.fromFunction1((t0: KeySystemInfo) => loadKeySession(t0).runNow()), removeKeySession = js.Any.fromFunction1((t0: SessionToken) => removeKeySession(t0).runNow()), reset = reset.toJsFn, setKeySystems = js.Any.fromFunction1((t0: js.Array[KeySystem]) => setKeySystems(t0).runNow()), setLicenseRequestFilters = js.Any.fromFunction1((t0: js.Array[RequestFilter]) => setLicenseRequestFilters(t0).runNow()), setLicenseResponseFilters = js.Any.fromFunction1((t0: js.Array[ResponseFilter]) => setLicenseResponseFilters(t0).runNow()), setMediaElement = js.Any.fromFunction1((t0: HTMLMediaElement) => setMediaElement(t0).runNow()), setProtectionData = js.Any.fromFunction1((t0: ProtectionDataSet) => setProtectionData(t0).runNow()), setRobustnessLevel = js.Any.fromFunction1((t0: String) => setRobustnessLevel(t0).runNow()), setServerCertificate = js.Any.fromFunction1((t0: js.typedarray.ArrayBuffer) => setServerCertificate(t0).runNow()), setSessionType = js.Any.fromFunction1((t0: String) => setSessionType(t0).runNow()), stop = stop.toJsFn)
    __obj.asInstanceOf[ProtectionController]
  }
  
  extension [Self <: ProtectionController](x: Self) {
    
    inline def setClearMediaInfoArray(value: Callback): Self = StObject.set(x, "clearMediaInfoArray", value.toJsFn)
    
    inline def setCloseKeySession(value: SessionToken => Callback): Self = StObject.set(x, "closeKeySession", js.Any.fromFunction1((t0: SessionToken) => value(t0).runNow()))
    
    inline def setCreateKeySession(value: KeySystemInfo => Callback): Self = StObject.set(x, "createKeySession", js.Any.fromFunction1((t0: KeySystemInfo) => value(t0).runNow()))
    
    inline def setGetKeySystems(value: CallbackTo[js.Array[KeySystem]]): Self = StObject.set(x, "getKeySystems", value.toJsFn)
    
    inline def setGetSupportedKeySystemsFromContentProtection(value: js.Array[Any] => js.Array[KeySystemInfo]): Self = StObject.set(x, "getSupportedKeySystemsFromContentProtection", js.Any.fromFunction1(value))
    
    inline def setInitializeForMedia(value: ProtectionMediaInfo => Callback): Self = StObject.set(x, "initializeForMedia", js.Any.fromFunction1((t0: ProtectionMediaInfo) => value(t0).runNow()))
    
    inline def setLoadKeySession(value: KeySystemInfo => Callback): Self = StObject.set(x, "loadKeySession", js.Any.fromFunction1((t0: KeySystemInfo) => value(t0).runNow()))
    
    inline def setRemoveKeySession(value: SessionToken => Callback): Self = StObject.set(x, "removeKeySession", js.Any.fromFunction1((t0: SessionToken) => value(t0).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSetKeySystems(value: js.Array[KeySystem] => Callback): Self = StObject.set(x, "setKeySystems", js.Any.fromFunction1((t0: js.Array[KeySystem]) => value(t0).runNow()))
    
    inline def setSetLicenseRequestFilters(value: js.Array[RequestFilter] => Callback): Self = StObject.set(x, "setLicenseRequestFilters", js.Any.fromFunction1((t0: js.Array[RequestFilter]) => value(t0).runNow()))
    
    inline def setSetLicenseResponseFilters(value: js.Array[ResponseFilter] => Callback): Self = StObject.set(x, "setLicenseResponseFilters", js.Any.fromFunction1((t0: js.Array[ResponseFilter]) => value(t0).runNow()))
    
    inline def setSetMediaElement(value: HTMLMediaElement => Callback): Self = StObject.set(x, "setMediaElement", js.Any.fromFunction1((t0: HTMLMediaElement) => value(t0).runNow()))
    
    inline def setSetProtectionData(value: ProtectionDataSet => Callback): Self = StObject.set(x, "setProtectionData", js.Any.fromFunction1((t0: ProtectionDataSet) => value(t0).runNow()))
    
    inline def setSetRobustnessLevel(value: String => Callback): Self = StObject.set(x, "setRobustnessLevel", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetServerCertificate(value: js.typedarray.ArrayBuffer => Callback): Self = StObject.set(x, "setServerCertificate", js.Any.fromFunction1((t0: js.typedarray.ArrayBuffer) => value(t0).runNow()))
    
    inline def setSetSessionType(value: String => Callback): Self = StObject.set(x, "setSessionType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
