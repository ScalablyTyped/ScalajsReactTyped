package typingsJapgolly.mercadopago

import typingsJapgolly.mercadopago.modelsDefaultConfigurationDotmodelMod.DefaultConfigurationOmitQs
import typingsJapgolly.mercadopago.modelsPreapprovalCreatePayloadDotmodelMod.CreatePreApprovalPayload
import typingsJapgolly.mercadopago.modelsPreapprovalUpdatePayloadDotmodelMod.UpdatePreApprovalPayload
import typingsJapgolly.mercadopago.sharedTypesMod.CallbackFunction
import typingsJapgolly.mercadopago.utilsMercadopagoResposeMod.ExecOptions
import typingsJapgolly.mercadopago.utilsMercadopagoResposeMod.MercadoPagoResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcesPreapprovalMod {
  
  @js.native
  trait MercadoPagoPreApproval extends StObject {
    
    /** Cancel a prepparoval */
    def cancel(id: String): js.Promise[PreApprovalUpdateResponse] = js.native
    def cancel(id: String, configuration: Unit, callback: CallbackFunction): js.Promise[PreApprovalUpdateResponse] = js.native
    def cancel(id: String, configuration: DefaultConfigurationOmitQs): js.Promise[PreApprovalUpdateResponse] = js.native
    def cancel(id: String, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[PreApprovalUpdateResponse] = js.native
    
    def create(payload: CreatePreApprovalPayload): js.Promise[PreApprovalCreateResponse] = js.native
    def create(payload: CreatePreApprovalPayload, configuration: Unit, callback: CallbackFunction): js.Promise[PreApprovalCreateResponse] = js.native
    def create(payload: CreatePreApprovalPayload, configuration: DefaultConfigurationOmitQs): js.Promise[PreApprovalCreateResponse] = js.native
    def create(
      payload: CreatePreApprovalPayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[PreApprovalCreateResponse] = js.native
    
    /** Alias for `get` method. */
    def findById(id: String): js.Promise[PreApprovalGetResponse] = js.native
    def findById(id: String, configuration: Unit, callback: CallbackFunction): js.Promise[PreApprovalGetResponse] = js.native
    def findById(id: String, configuration: DefaultConfigurationOmitQs): js.Promise[PreApprovalGetResponse] = js.native
    def findById(id: String, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[PreApprovalGetResponse] = js.native
    
    def get(id: String): js.Promise[PreApprovalGetResponse] = js.native
    def get(id: String, configuration: Unit, callback: CallbackFunction): js.Promise[PreApprovalGetResponse] = js.native
    def get(id: String, configuration: DefaultConfigurationOmitQs): js.Promise[PreApprovalGetResponse] = js.native
    def get(id: String, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[PreApprovalGetResponse] = js.native
    
    /** Pause a preapproval */
    def pause(id: String): js.Promise[PreApprovalUpdateResponse] = js.native
    def pause(id: String, configuration: Unit, callback: CallbackFunction): js.Promise[PreApprovalUpdateResponse] = js.native
    def pause(id: String, configuration: DefaultConfigurationOmitQs): js.Promise[PreApprovalUpdateResponse] = js.native
    def pause(id: String, configuration: DefaultConfigurationOmitQs, callback: CallbackFunction): js.Promise[PreApprovalUpdateResponse] = js.native
    
    /** Alias for `create` method. */
    def save(payload: CreatePreApprovalPayload): js.Promise[PreApprovalCreateResponse] = js.native
    def save(payload: CreatePreApprovalPayload, configuration: Unit, callback: CallbackFunction): js.Promise[PreApprovalCreateResponse] = js.native
    def save(payload: CreatePreApprovalPayload, configuration: DefaultConfigurationOmitQs): js.Promise[PreApprovalCreateResponse] = js.native
    def save(
      payload: CreatePreApprovalPayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[PreApprovalCreateResponse] = js.native
    
    def update(payload: UpdatePreApprovalPayload): js.Promise[PreApprovalUpdateResponse] = js.native
    def update(payload: UpdatePreApprovalPayload, configuration: Unit, callback: CallbackFunction): js.Promise[PreApprovalUpdateResponse] = js.native
    def update(payload: UpdatePreApprovalPayload, configuration: DefaultConfigurationOmitQs): js.Promise[PreApprovalUpdateResponse] = js.native
    def update(
      payload: UpdatePreApprovalPayload,
      configuration: DefaultConfigurationOmitQs,
      callback: CallbackFunction
    ): js.Promise[PreApprovalUpdateResponse] = js.native
  }
  
  type PreApprovalCreateResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, CreatePreApprovalPayload]]
  
  type PreApprovalGetResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, Any]]
  
  type PreApprovalUpdateResponse = MercadoPagoResponse[ExecOptions[DefaultConfigurationOmitQs, UpdatePreApprovalPayload]]
}
