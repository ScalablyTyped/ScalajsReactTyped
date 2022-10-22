package typingsJapgolly.mparticleWebSdk.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentState extends StObject {
  
  def addGDPRConsentState(purpose: String, gdprConsent: PrivacyConsentState): ConsentState
  
  def getCCPAConsentState(): CCPAConsentState
  
  def getGDPRConsentState(): GDPRConsentState
  
  def removeCCPAConsentState(): ConsentState
  
  def removeGDPRConsentState(purpose: String): ConsentState
  
  def setCCPAConsentState(ccpaConsentState: CCPAConsentState): ConsentState
  
  def setGDPRConsentState(gdprConsentState: GDPRConsentState): ConsentState
}
object ConsentState {
  
  inline def apply(
    addGDPRConsentState: (String, PrivacyConsentState) => ConsentState,
    getCCPAConsentState: CallbackTo[CCPAConsentState],
    getGDPRConsentState: CallbackTo[GDPRConsentState],
    removeCCPAConsentState: CallbackTo[ConsentState],
    removeGDPRConsentState: String => ConsentState,
    setCCPAConsentState: CCPAConsentState => ConsentState,
    setGDPRConsentState: GDPRConsentState => ConsentState
  ): ConsentState = {
    val __obj = js.Dynamic.literal(addGDPRConsentState = js.Any.fromFunction2(addGDPRConsentState), getCCPAConsentState = getCCPAConsentState.toJsFn, getGDPRConsentState = getGDPRConsentState.toJsFn, removeCCPAConsentState = removeCCPAConsentState.toJsFn, removeGDPRConsentState = js.Any.fromFunction1(removeGDPRConsentState), setCCPAConsentState = js.Any.fromFunction1(setCCPAConsentState), setGDPRConsentState = js.Any.fromFunction1(setGDPRConsentState))
    __obj.asInstanceOf[ConsentState]
  }
  
  extension [Self <: ConsentState](x: Self) {
    
    inline def setAddGDPRConsentState(value: (String, PrivacyConsentState) => ConsentState): Self = StObject.set(x, "addGDPRConsentState", js.Any.fromFunction2(value))
    
    inline def setGetCCPAConsentState(value: CallbackTo[CCPAConsentState]): Self = StObject.set(x, "getCCPAConsentState", value.toJsFn)
    
    inline def setGetGDPRConsentState(value: CallbackTo[GDPRConsentState]): Self = StObject.set(x, "getGDPRConsentState", value.toJsFn)
    
    inline def setRemoveCCPAConsentState(value: CallbackTo[ConsentState]): Self = StObject.set(x, "removeCCPAConsentState", value.toJsFn)
    
    inline def setRemoveGDPRConsentState(value: String => ConsentState): Self = StObject.set(x, "removeGDPRConsentState", js.Any.fromFunction1(value))
    
    inline def setSetCCPAConsentState(value: CCPAConsentState => ConsentState): Self = StObject.set(x, "setCCPAConsentState", js.Any.fromFunction1(value))
    
    inline def setSetGDPRConsentState(value: GDPRConsentState => ConsentState): Self = StObject.set(x, "setGDPRConsentState", js.Any.fromFunction1(value))
  }
}
