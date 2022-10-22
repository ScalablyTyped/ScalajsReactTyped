package typingsJapgolly.iamportReactNative

import japgolly.scalajs.react.Callback
import typingsJapgolly.iamportReactNative.anon.Cardquota
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("iamport-react-native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("iamport-react-native", "default.Certification")
    @js.native
    def Certification: FC[CertificationProps] = js.native
    inline def Certification_=(x: FC[CertificationProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Certification")(x.asInstanceOf[js.Any])
    
    @JSImport("iamport-react-native", "default.Payment")
    @js.native
    def Payment: FC[PaymentProps] = js.native
    inline def Payment_=(x: FC[PaymentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Payment")(x.asInstanceOf[js.Any])
  }
  
  trait CallbackRsp extends StObject {
    
    var apply_num: js.UndefOr[String] = js.undefined
    
    var buyer_addr: js.UndefOr[String] = js.undefined
    
    var buyer_email: js.UndefOr[String] = js.undefined
    
    var buyer_name: js.UndefOr[String] = js.undefined
    
    var buyer_postcode: js.UndefOr[String] = js.undefined
    
    var buyer_tel: js.UndefOr[String] = js.undefined
    
    var custom_data: js.UndefOr[js.Object] = js.undefined
    
    var error_code: js.UndefOr[String] = js.undefined
    
    var error_msg: js.UndefOr[String] = js.undefined
    
    var imp_success: js.UndefOr[String] = js.undefined
    
    var imp_uid: js.UndefOr[String] = js.undefined
    
    var merchant_uid: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var paid_amount: js.UndefOr[String] = js.undefined
    
    var paid_at: js.UndefOr[Double] = js.undefined
    
    var pay_method: js.UndefOr[String] = js.undefined
    
    var pg_provider: js.UndefOr[String] = js.undefined
    
    var pg_tid: js.UndefOr[String] = js.undefined
    
    var receipt_url: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[Boolean] = js.undefined
    
    var vbank_date: js.UndefOr[Double] = js.undefined
    
    var vbank_holder: js.UndefOr[String] = js.undefined
    
    var vbank_name: js.UndefOr[String] = js.undefined
    
    var vbank_num: js.UndefOr[String] = js.undefined
  }
  object CallbackRsp {
    
    inline def apply(): CallbackRsp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackRsp]
    }
    
    extension [Self <: CallbackRsp](x: Self) {
      
      inline def setApply_num(value: String): Self = StObject.set(x, "apply_num", value.asInstanceOf[js.Any])
      
      inline def setApply_numUndefined: Self = StObject.set(x, "apply_num", js.undefined)
      
      inline def setBuyer_addr(value: String): Self = StObject.set(x, "buyer_addr", value.asInstanceOf[js.Any])
      
      inline def setBuyer_addrUndefined: Self = StObject.set(x, "buyer_addr", js.undefined)
      
      inline def setBuyer_email(value: String): Self = StObject.set(x, "buyer_email", value.asInstanceOf[js.Any])
      
      inline def setBuyer_emailUndefined: Self = StObject.set(x, "buyer_email", js.undefined)
      
      inline def setBuyer_name(value: String): Self = StObject.set(x, "buyer_name", value.asInstanceOf[js.Any])
      
      inline def setBuyer_nameUndefined: Self = StObject.set(x, "buyer_name", js.undefined)
      
      inline def setBuyer_postcode(value: String): Self = StObject.set(x, "buyer_postcode", value.asInstanceOf[js.Any])
      
      inline def setBuyer_postcodeUndefined: Self = StObject.set(x, "buyer_postcode", js.undefined)
      
      inline def setBuyer_tel(value: String): Self = StObject.set(x, "buyer_tel", value.asInstanceOf[js.Any])
      
      inline def setBuyer_telUndefined: Self = StObject.set(x, "buyer_tel", js.undefined)
      
      inline def setCustom_data(value: js.Object): Self = StObject.set(x, "custom_data", value.asInstanceOf[js.Any])
      
      inline def setCustom_dataUndefined: Self = StObject.set(x, "custom_data", js.undefined)
      
      inline def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setError_codeUndefined: Self = StObject.set(x, "error_code", js.undefined)
      
      inline def setError_msg(value: String): Self = StObject.set(x, "error_msg", value.asInstanceOf[js.Any])
      
      inline def setError_msgUndefined: Self = StObject.set(x, "error_msg", js.undefined)
      
      inline def setImp_success(value: String): Self = StObject.set(x, "imp_success", value.asInstanceOf[js.Any])
      
      inline def setImp_successUndefined: Self = StObject.set(x, "imp_success", js.undefined)
      
      inline def setImp_uid(value: String): Self = StObject.set(x, "imp_uid", value.asInstanceOf[js.Any])
      
      inline def setImp_uidUndefined: Self = StObject.set(x, "imp_uid", js.undefined)
      
      inline def setMerchant_uid(value: String): Self = StObject.set(x, "merchant_uid", value.asInstanceOf[js.Any])
      
      inline def setMerchant_uidUndefined: Self = StObject.set(x, "merchant_uid", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPaid_amount(value: String): Self = StObject.set(x, "paid_amount", value.asInstanceOf[js.Any])
      
      inline def setPaid_amountUndefined: Self = StObject.set(x, "paid_amount", js.undefined)
      
      inline def setPaid_at(value: Double): Self = StObject.set(x, "paid_at", value.asInstanceOf[js.Any])
      
      inline def setPaid_atUndefined: Self = StObject.set(x, "paid_at", js.undefined)
      
      inline def setPay_method(value: String): Self = StObject.set(x, "pay_method", value.asInstanceOf[js.Any])
      
      inline def setPay_methodUndefined: Self = StObject.set(x, "pay_method", js.undefined)
      
      inline def setPg_provider(value: String): Self = StObject.set(x, "pg_provider", value.asInstanceOf[js.Any])
      
      inline def setPg_providerUndefined: Self = StObject.set(x, "pg_provider", js.undefined)
      
      inline def setPg_tid(value: String): Self = StObject.set(x, "pg_tid", value.asInstanceOf[js.Any])
      
      inline def setPg_tidUndefined: Self = StObject.set(x, "pg_tid", js.undefined)
      
      inline def setReceipt_url(value: String): Self = StObject.set(x, "receipt_url", value.asInstanceOf[js.Any])
      
      inline def setReceipt_urlUndefined: Self = StObject.set(x, "receipt_url", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setVbank_date(value: Double): Self = StObject.set(x, "vbank_date", value.asInstanceOf[js.Any])
      
      inline def setVbank_dateUndefined: Self = StObject.set(x, "vbank_date", js.undefined)
      
      inline def setVbank_holder(value: String): Self = StObject.set(x, "vbank_holder", value.asInstanceOf[js.Any])
      
      inline def setVbank_holderUndefined: Self = StObject.set(x, "vbank_holder", js.undefined)
      
      inline def setVbank_name(value: String): Self = StObject.set(x, "vbank_name", value.asInstanceOf[js.Any])
      
      inline def setVbank_nameUndefined: Self = StObject.set(x, "vbank_name", js.undefined)
      
      inline def setVbank_num(value: String): Self = StObject.set(x, "vbank_num", value.asInstanceOf[js.Any])
      
      inline def setVbank_numUndefined: Self = StObject.set(x, "vbank_num", js.undefined)
    }
  }
  
  trait CertificationData extends StObject {
    
    var app_scheme: js.UndefOr[String] = js.undefined
    
    var carrier: js.UndefOr[IMP_CARRIERS] = js.undefined
    
    var company: js.UndefOr[String] = js.undefined
    
    var merchant_uid: js.UndefOr[String] = js.undefined
    
    var min_age: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var phone: js.UndefOr[String] = js.undefined
  }
  object CertificationData {
    
    inline def apply(): CertificationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificationData]
    }
    
    extension [Self <: CertificationData](x: Self) {
      
      inline def setApp_scheme(value: String): Self = StObject.set(x, "app_scheme", value.asInstanceOf[js.Any])
      
      inline def setApp_schemeUndefined: Self = StObject.set(x, "app_scheme", js.undefined)
      
      inline def setCarrier(value: IMP_CARRIERS): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
      
      inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setMerchant_uid(value: String): Self = StObject.set(x, "merchant_uid", value.asInstanceOf[js.Any])
      
      inline def setMerchant_uidUndefined: Self = StObject.set(x, "merchant_uid", js.undefined)
      
      inline def setMin_age(value: String): Self = StObject.set(x, "min_age", value.asInstanceOf[js.Any])
      
      inline def setMin_ageUndefined: Self = StObject.set(x, "min_age", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    }
  }
  
  trait CertificationProps extends StObject {
    
    def callback(rsp: CallbackRsp): Unit
    
    var data: CertificationData
    
    var loading: js.UndefOr[js.Object] = js.undefined
    
    var tierCode: js.UndefOr[String] = js.undefined
    
    var userCode: String
  }
  object CertificationProps {
    
    inline def apply(callback: CallbackRsp => Callback, data: CertificationData, userCode: String): CertificationProps = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: CallbackRsp) => callback(t0).runNow()), data = data.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificationProps]
    }
    
    extension [Self <: CertificationProps](x: Self) {
      
      inline def setCallback(value: CallbackRsp => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: CallbackRsp) => value(t0).runNow()))
      
      inline def setData(value: CertificationData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: js.Object): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setTierCode(value: String): Self = StObject.set(x, "tierCode", value.asInstanceOf[js.Any])
      
      inline def setTierCodeUndefined: Self = StObject.set(x, "tierCode", js.undefined)
      
      inline def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.SKT
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.KTF
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.LGT
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.MVNO
  */
  trait IMP_CARRIERS extends StObject
  object IMP_CARRIERS {
    
    inline def KTF: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.KTF = "KTF".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.KTF]
    
    inline def LGT: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.LGT = "LGT".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.LGT]
    
    inline def MVNO: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.MVNO = "MVNO".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.MVNO]
    
    inline def SKT: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.SKT = "SKT".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.SKT]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.KRW
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.USD
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.EUR
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.JPY
  */
  trait IMP_CURRENCY extends StObject
  object IMP_CURRENCY {
    
    inline def EUR: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.EUR = "EUR".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.EUR]
    
    inline def JPY: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.JPY = "JPY".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.JPY]
    
    inline def KRW: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.KRW = "KRW".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.KRW]
    
    inline def USD: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.USD = "USD".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.USD]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.card
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.trans
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.vbank
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.phone
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.samsung
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kpay
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.cultureland
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.smartculture
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.happymoney
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.booknlife
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kakaopay
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.lpay
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.payco
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.ssgpay
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.tosspay
  */
  trait IMP_PAY_METHOD extends StObject
  object IMP_PAY_METHOD {
    
    inline def booknlife: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.booknlife = "booknlife".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.booknlife]
    
    inline def card: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.card = "card".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.card]
    
    inline def cultureland: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.cultureland = "cultureland".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.cultureland]
    
    inline def happymoney: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.happymoney = "happymoney".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.happymoney]
    
    inline def kakaopay: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kakaopay = "kakaopay".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kakaopay]
    
    inline def kpay: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kpay = "kpay".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kpay]
    
    inline def lpay: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.lpay = "lpay".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.lpay]
    
    inline def payco: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.payco = "payco".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.payco]
    
    inline def phone: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.phone = "phone".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.phone]
    
    inline def samsung: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.samsung = "samsung".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.samsung]
    
    inline def smartculture: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.smartculture = "smartculture".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.smartculture]
    
    inline def ssgpay: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.ssgpay = "ssgpay".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.ssgpay]
    
    inline def tosspay: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.tosspay = "tosspay".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.tosspay]
    
    inline def trans: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.trans = "trans".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.trans]
    
    inline def vbank: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.vbank = "vbank".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.vbank]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.html5_inicis
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.inicis
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.uplus
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kcp
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kcp_billing
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.nice
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.jtnet
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kakao
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kakaopay
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.danal
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.danal_tpay
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kicc
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.settle
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.mobilians
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.payco
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.eximbay
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.paypal
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.naverco
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.naverpay
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.smilepay
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.chai
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.payple
    - typingsJapgolly.iamportReactNative.iamportReactNativeStrings.alipay
  */
  trait IMP_PG extends StObject
  object IMP_PG {
    
    inline def alipay: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.alipay = "alipay".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.alipay]
    
    inline def chai: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.chai = "chai".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.chai]
    
    inline def danal: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.danal = "danal".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.danal]
    
    inline def danal_tpay: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.danal_tpay = "danal_tpay".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.danal_tpay]
    
    inline def eximbay: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.eximbay = "eximbay".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.eximbay]
    
    inline def html5_inicis: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.html5_inicis = "html5_inicis".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.html5_inicis]
    
    inline def inicis: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.inicis = "inicis".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.inicis]
    
    inline def jtnet: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.jtnet = "jtnet".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.jtnet]
    
    inline def kakao: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kakao = "kakao".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kakao]
    
    inline def kakaopay: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kakaopay = "kakaopay".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kakaopay]
    
    inline def kcp: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kcp = "kcp".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kcp]
    
    inline def kcp_billing: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kcp_billing = "kcp_billing".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kcp_billing]
    
    inline def kicc: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kicc = "kicc".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.kicc]
    
    inline def mobilians: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.mobilians = "mobilians".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.mobilians]
    
    inline def naverco: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.naverco = "naverco".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.naverco]
    
    inline def naverpay: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.naverpay = "naverpay".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.naverpay]
    
    inline def nice: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.nice = "nice".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.nice]
    
    inline def payco: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.payco = "payco".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.payco]
    
    inline def paypal: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.paypal = "paypal".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.paypal]
    
    inline def payple: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.payple = "payple".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.payple]
    
    inline def settle: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.settle = "settle".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.settle]
    
    inline def smilepay: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.smilepay = "smilepay".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.smilepay]
    
    inline def uplus: typingsJapgolly.iamportReactNative.iamportReactNativeStrings.uplus = "uplus".asInstanceOf[typingsJapgolly.iamportReactNative.iamportReactNativeStrings.uplus]
  }
  
  trait PaymentData extends StObject {
    
    var amount: Double
    
    var app_scheme: String
    
    var biz_num: js.UndefOr[String] = js.undefined
    
    var buyer_addr: js.UndefOr[String] = js.undefined
    
    var buyer_email: js.UndefOr[String] = js.undefined
    
    var buyer_name: js.UndefOr[String] = js.undefined
    
    var buyer_postcode: js.UndefOr[String] = js.undefined
    
    var buyer_tel: String
    
    var currency: js.UndefOr[IMP_CURRENCY] = js.undefined
    
    var custom_data: js.UndefOr[js.Object] = js.undefined
    
    var digital: js.UndefOr[Boolean] = js.undefined
    
    var display: js.UndefOr[Cardquota] = js.undefined
    
    var escrow: js.UndefOr[Boolean] = js.undefined
    
    var m_redirect_url: js.UndefOr[String] = js.undefined
    
    var merchant_uid: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var notice_url: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var pay_method: js.UndefOr[IMP_PAY_METHOD] = js.undefined
    
    var pg: js.UndefOr[IMP_PG] = js.undefined
    
    var popup: js.UndefOr[Boolean] = js.undefined
    
    var tax_free: js.UndefOr[Double] = js.undefined
    
    var vbank_due: js.UndefOr[String] = js.undefined
  }
  object PaymentData {
    
    inline def apply(amount: Double, app_scheme: String, buyer_tel: String, merchant_uid: String): PaymentData = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], app_scheme = app_scheme.asInstanceOf[js.Any], buyer_tel = buyer_tel.asInstanceOf[js.Any], merchant_uid = merchant_uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentData]
    }
    
    extension [Self <: PaymentData](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setApp_scheme(value: String): Self = StObject.set(x, "app_scheme", value.asInstanceOf[js.Any])
      
      inline def setBiz_num(value: String): Self = StObject.set(x, "biz_num", value.asInstanceOf[js.Any])
      
      inline def setBiz_numUndefined: Self = StObject.set(x, "biz_num", js.undefined)
      
      inline def setBuyer_addr(value: String): Self = StObject.set(x, "buyer_addr", value.asInstanceOf[js.Any])
      
      inline def setBuyer_addrUndefined: Self = StObject.set(x, "buyer_addr", js.undefined)
      
      inline def setBuyer_email(value: String): Self = StObject.set(x, "buyer_email", value.asInstanceOf[js.Any])
      
      inline def setBuyer_emailUndefined: Self = StObject.set(x, "buyer_email", js.undefined)
      
      inline def setBuyer_name(value: String): Self = StObject.set(x, "buyer_name", value.asInstanceOf[js.Any])
      
      inline def setBuyer_nameUndefined: Self = StObject.set(x, "buyer_name", js.undefined)
      
      inline def setBuyer_postcode(value: String): Self = StObject.set(x, "buyer_postcode", value.asInstanceOf[js.Any])
      
      inline def setBuyer_postcodeUndefined: Self = StObject.set(x, "buyer_postcode", js.undefined)
      
      inline def setBuyer_tel(value: String): Self = StObject.set(x, "buyer_tel", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: IMP_CURRENCY): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setCustom_data(value: js.Object): Self = StObject.set(x, "custom_data", value.asInstanceOf[js.Any])
      
      inline def setCustom_dataUndefined: Self = StObject.set(x, "custom_data", js.undefined)
      
      inline def setDigital(value: Boolean): Self = StObject.set(x, "digital", value.asInstanceOf[js.Any])
      
      inline def setDigitalUndefined: Self = StObject.set(x, "digital", js.undefined)
      
      inline def setDisplay(value: Cardquota): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setEscrow(value: Boolean): Self = StObject.set(x, "escrow", value.asInstanceOf[js.Any])
      
      inline def setEscrowUndefined: Self = StObject.set(x, "escrow", js.undefined)
      
      inline def setM_redirect_url(value: String): Self = StObject.set(x, "m_redirect_url", value.asInstanceOf[js.Any])
      
      inline def setM_redirect_urlUndefined: Self = StObject.set(x, "m_redirect_url", js.undefined)
      
      inline def setMerchant_uid(value: String): Self = StObject.set(x, "merchant_uid", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNotice_url(value: String | js.Array[String]): Self = StObject.set(x, "notice_url", value.asInstanceOf[js.Any])
      
      inline def setNotice_urlUndefined: Self = StObject.set(x, "notice_url", js.undefined)
      
      inline def setNotice_urlVarargs(value: String*): Self = StObject.set(x, "notice_url", js.Array(value*))
      
      inline def setPay_method(value: IMP_PAY_METHOD): Self = StObject.set(x, "pay_method", value.asInstanceOf[js.Any])
      
      inline def setPay_methodUndefined: Self = StObject.set(x, "pay_method", js.undefined)
      
      inline def setPg(value: IMP_PG): Self = StObject.set(x, "pg", value.asInstanceOf[js.Any])
      
      inline def setPgUndefined: Self = StObject.set(x, "pg", js.undefined)
      
      inline def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      inline def setTax_free(value: Double): Self = StObject.set(x, "tax_free", value.asInstanceOf[js.Any])
      
      inline def setTax_freeUndefined: Self = StObject.set(x, "tax_free", js.undefined)
      
      inline def setVbank_due(value: String): Self = StObject.set(x, "vbank_due", value.asInstanceOf[js.Any])
      
      inline def setVbank_dueUndefined: Self = StObject.set(x, "vbank_due", js.undefined)
    }
  }
  
  trait PaymentProps extends StObject {
    
    def callback(rsp: CallbackRsp): Unit
    
    var data: PaymentData
    
    var handleInicisTrans: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var loading: js.UndefOr[js.Object] = js.undefined
    
    var open3rdPartyApp: js.UndefOr[js.Function1[/* iamportUrl */ Any, Unit]] = js.undefined
    
    var tierCode: js.UndefOr[String] = js.undefined
    
    var userCode: String
  }
  object PaymentProps {
    
    inline def apply(callback: CallbackRsp => Callback, data: PaymentData, userCode: String): PaymentProps = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: CallbackRsp) => callback(t0).runNow()), data = data.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentProps]
    }
    
    extension [Self <: PaymentProps](x: Self) {
      
      inline def setCallback(value: CallbackRsp => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: CallbackRsp) => value(t0).runNow()))
      
      inline def setData(value: PaymentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHandleInicisTrans(value: /* event */ Any => Callback): Self = StObject.set(x, "handleInicisTrans", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
      
      inline def setHandleInicisTransUndefined: Self = StObject.set(x, "handleInicisTrans", js.undefined)
      
      inline def setLoading(value: js.Object): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOpen3rdPartyApp(value: /* iamportUrl */ Any => Callback): Self = StObject.set(x, "open3rdPartyApp", js.Any.fromFunction1((t0: /* iamportUrl */ Any) => value(t0).runNow()))
      
      inline def setOpen3rdPartyAppUndefined: Self = StObject.set(x, "open3rdPartyApp", js.undefined)
      
      inline def setTierCode(value: String): Self = StObject.set(x, "tierCode", value.asInstanceOf[js.Any])
      
      inline def setTierCodeUndefined: Self = StObject.set(x, "tierCode", js.undefined)
      
      inline def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
    }
  }
}
