package typingsJapgolly.kavenegar

import japgolly.scalajs.react.Callback
import typingsJapgolly.kavenegar.anon.Apilogs
import typingsJapgolly.kavenegar.anon.Cost
import typingsJapgolly.kavenegar.anon.Dailyreport
import typingsJapgolly.kavenegar.anon.Date
import typingsJapgolly.kavenegar.anon.Enddate
import typingsJapgolly.kavenegar.anon.EnddateStartdate
import typingsJapgolly.kavenegar.anon.Expiredate
import typingsJapgolly.kavenegar.anon.Hide
import typingsJapgolly.kavenegar.anon.Isread
import typingsJapgolly.kavenegar.anon.Linenumber
import typingsJapgolly.kavenegar.anon.Localid
import typingsJapgolly.kavenegar.anon.Message
import typingsJapgolly.kavenegar.anon.Messageid
import typingsJapgolly.kavenegar.anon.Pagesize
import typingsJapgolly.kavenegar.anon.Receptor
import typingsJapgolly.kavenegar.anon.Repeat
import typingsJapgolly.kavenegar.anon.Startdate
import typingsJapgolly.kavenegar.anon.Status
import typingsJapgolly.kavenegar.anon.Statustext
import typingsJapgolly.kavenegar.anon.Sumcount
import typingsJapgolly.kavenegar.mod.kavenegar.KavenegarInstance
import typingsJapgolly.kavenegar.mod.kavenegar.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kavenegar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def KavenegarApi(options: Options): KavenegarInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("KavenegarApi")(options.asInstanceOf[js.Any]).asInstanceOf[KavenegarInstance]
  
  object kavenegar {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.kavenegar.kavenegarStrings.sms
      - typingsJapgolly.kavenegar.kavenegarStrings.verify
      - typingsJapgolly.kavenegar.kavenegarStrings.account
      - typingsJapgolly.kavenegar.kavenegarStrings.call
    */
    trait Actions extends StObject
    object Actions {
      
      inline def account: typingsJapgolly.kavenegar.kavenegarStrings.account = "account".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.account]
      
      inline def call: typingsJapgolly.kavenegar.kavenegarStrings.call = "call".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.call]
      
      inline def sms: typingsJapgolly.kavenegar.kavenegarStrings.sms = "sms".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.sms]
      
      inline def verify: typingsJapgolly.kavenegar.kavenegarStrings.verify = "verify".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.verify]
    }
    
    trait KavenegarInstance extends StObject {
      
      def AccountConfig(
        data: Apilogs,
        callback: js.Function3[/* entries */ Dailyreport, /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("AccountConfig")
      var AccountConfig_Original: ResponseK[Apilogs, Dailyreport]
      
      def AccountInfo(
        data: js.Object,
        callback: js.Function3[/* entries */ Expiredate, /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("AccountInfo")
      var AccountInfo_Original: ResponseK[js.Object, Expiredate]
      
      def CallMakeTTS(
        data: Repeat,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("CallMakeTTS")
      var CallMakeTTS_Original: ResponseK[Repeat, js.Array[Cost]]
      
      def Cancel(
        data: Messageid,
        callback: js.Function3[/* entries */ js.Array[Status], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("Cancel")
      var Cancel_Original: ResponseK[Messageid, js.Array[Status]]
      
      def CountInbox(
        data: Linenumber,
        callback: js.Function3[
              /* entries */ js.Array[EnddateStartdate], 
              /* status */ Double, 
              /* message */ String, 
              Unit
            ]
      ): Unit
      @JSName("CountInbox")
      var CountInbox_Original: ResponseK[Linenumber, js.Array[EnddateStartdate]]
      
      def CountOutbox(
        data: Startdate,
        callback: js.Function3[/* entries */ js.Array[Sumcount], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("CountOutbox")
      var CountOutbox_Original: ResponseK[Startdate, js.Array[Sumcount]]
      
      def CountPostalCode(
        data: Any,
        callback: js.Function3[/* entries */ Any, /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("CountPostalCode")
      var CountPostalCode_Original: ResponseK[Any, Any]
      
      def LatestOutbox(
        data: Pagesize,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("LatestOutbox")
      var LatestOutbox_Original: ResponseK[Pagesize, js.Array[Cost]]
      
      def Receive(
        data: Isread,
        callback: js.Function3[/* entries */ js.Array[Message], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("Receive")
      var Receive_Original: ResponseK[Isread, js.Array[Message]]
      
      def Select(
        data: Messageid,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      
      def SelectOutbox(
        data: Enddate,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("SelectOutbox")
      var SelectOutbox_Original: ResponseK[Enddate, js.Array[Cost]]
      
      @JSName("Select")
      var Select_Original: ResponseK[Messageid, js.Array[Cost]]
      
      def Send(
        data: Date,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      
      def SendArray(
        data: Hide,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("SendArray")
      var SendArray_Original: ResponseK[Hide, js.Array[Cost]]
      
      def SendByPostalCode(
        data: Any,
        callback: js.Function3[/* entries */ Any, /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("SendByPostalCode")
      var SendByPostalCode_Original: ResponseK[Any, Any]
      
      @JSName("Send")
      var Send_Original: ResponseK[Date, js.Array[Cost]]
      
      def Status(
        data: Messageid,
        callback: js.Function3[
              /* entries */ js.Array[typingsJapgolly.kavenegar.anon.Status], 
              /* status */ Double, 
              /* message */ String, 
              Unit
            ]
      ): Unit
      
      def StatusLocalMessageid(
        data: Localid,
        callback: js.Function3[/* entries */ js.Array[Statustext], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("StatusLocalMessageid")
      var StatusLocalMessageid_Original: ResponseK[Localid, js.Array[Statustext]]
      
      @JSName("Status")
      var Status_Original: ResponseK[Messageid, js.Array[Status]]
      
      def VerifyLookup(
        data: Receptor,
        callback: js.Function3[/* entries */ js.Array[Cost], /* status */ Double, /* message */ String, Unit]
      ): Unit
      @JSName("VerifyLookup")
      var VerifyLookup_Original: ResponseK[Receptor, js.Array[Cost]]
      
      def request(action: Actions, method: Methods, params: js.Object, callback: Any): Unit
    }
    object KavenegarInstance {
      
      inline def apply(
        AccountConfig: (Apilogs, /* callback */ js.Function3[Dailyreport, /* status */ Double, /* message */ String, Unit]) => Callback,
        AccountInfo: (js.Object, /* callback */ js.Function3[Expiredate, /* status */ Double, /* message */ String, Unit]) => Callback,
        CallMakeTTS: (Repeat, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback,
        Cancel: (Messageid, /* callback */ js.Function3[js.Array[Status], /* status */ Double, /* message */ String, Unit]) => Callback,
        CountInbox: (Linenumber, /* callback */ js.Function3[js.Array[EnddateStartdate], /* status */ Double, /* message */ String, Unit]) => Callback,
        CountOutbox: (Startdate, /* callback */ js.Function3[js.Array[Sumcount], /* status */ Double, /* message */ String, Unit]) => Callback,
        CountPostalCode: (Any, /* callback */ js.Function3[Any, /* status */ Double, /* message */ String, Unit]) => Callback,
        LatestOutbox: (Pagesize, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback,
        Receive: (Isread, /* callback */ js.Function3[js.Array[Message], /* status */ Double, /* message */ String, Unit]) => Callback,
        Select: (Messageid, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback,
        SelectOutbox: (Enddate, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback,
        Send: (Date, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback,
        SendArray: (Hide, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback,
        SendByPostalCode: (Any, /* callback */ js.Function3[Any, /* status */ Double, /* message */ String, Unit]) => Callback,
        Status: (Messageid, /* callback */ js.Function3[js.Array[Status], /* status */ Double, /* message */ String, Unit]) => Callback,
        StatusLocalMessageid: (Localid, /* callback */ js.Function3[js.Array[Statustext], /* status */ Double, /* message */ String, Unit]) => Callback,
        VerifyLookup: (Receptor, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback,
        request: (Actions, Methods, js.Object, Any) => Callback
      ): KavenegarInstance = {
        val __obj = js.Dynamic.literal(AccountConfig = js.Any.fromFunction2((t0: Apilogs, t1: /* callback */ js.Function3[Dailyreport, /* status */ Double, /* message */ String, Unit]) => (AccountConfig(t0, t1)).runNow()), AccountInfo = js.Any.fromFunction2((t0: js.Object, t1: /* callback */ js.Function3[Expiredate, /* status */ Double, /* message */ String, Unit]) => (AccountInfo(t0, t1)).runNow()), CallMakeTTS = js.Any.fromFunction2((t0: Repeat, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (CallMakeTTS(t0, t1)).runNow()), Cancel = js.Any.fromFunction2((t0: Messageid, t1: /* callback */ js.Function3[js.Array[Status], /* status */ Double, /* message */ String, Unit]) => (Cancel(t0, t1)).runNow()), CountInbox = js.Any.fromFunction2((t0: Linenumber, t1: /* callback */ js.Function3[js.Array[EnddateStartdate], /* status */ Double, /* message */ String, Unit]) => (CountInbox(t0, t1)).runNow()), CountOutbox = js.Any.fromFunction2((t0: Startdate, t1: /* callback */ js.Function3[js.Array[Sumcount], /* status */ Double, /* message */ String, Unit]) => (CountOutbox(t0, t1)).runNow()), CountPostalCode = js.Any.fromFunction2((t0: Any, t1: /* callback */ js.Function3[Any, /* status */ Double, /* message */ String, Unit]) => (CountPostalCode(t0, t1)).runNow()), LatestOutbox = js.Any.fromFunction2((t0: Pagesize, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (LatestOutbox(t0, t1)).runNow()), Receive = js.Any.fromFunction2((t0: Isread, t1: /* callback */ js.Function3[js.Array[Message], /* status */ Double, /* message */ String, Unit]) => (Receive(t0, t1)).runNow()), Select = js.Any.fromFunction2((t0: Messageid, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (Select(t0, t1)).runNow()), SelectOutbox = js.Any.fromFunction2((t0: Enddate, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (SelectOutbox(t0, t1)).runNow()), Send = js.Any.fromFunction2((t0: Date, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (Send(t0, t1)).runNow()), SendArray = js.Any.fromFunction2((t0: Hide, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (SendArray(t0, t1)).runNow()), SendByPostalCode = js.Any.fromFunction2((t0: Any, t1: /* callback */ js.Function3[Any, /* status */ Double, /* message */ String, Unit]) => (SendByPostalCode(t0, t1)).runNow()), Status = js.Any.fromFunction2((t0: Messageid, t1: /* callback */ js.Function3[js.Array[Status], /* status */ Double, /* message */ String, Unit]) => (Status(t0, t1)).runNow()), StatusLocalMessageid = js.Any.fromFunction2((t0: Localid, t1: /* callback */ js.Function3[js.Array[Statustext], /* status */ Double, /* message */ String, Unit]) => (StatusLocalMessageid(t0, t1)).runNow()), VerifyLookup = js.Any.fromFunction2((t0: Receptor, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (VerifyLookup(t0, t1)).runNow()), request = js.Any.fromFunction4((t0: Actions, t1: Methods, t2: js.Object, t3: Any) => (request(t0, t1, t2, t3)).runNow()))
        __obj.asInstanceOf[KavenegarInstance]
      }
      
      extension [Self <: KavenegarInstance](x: Self) {
        
        inline def setAccountConfig(
          value: (Apilogs, /* callback */ js.Function3[Dailyreport, /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "AccountConfig", js.Any.fromFunction2((t0: Apilogs, t1: /* callback */ js.Function3[Dailyreport, /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setAccountInfo(
          value: (js.Object, /* callback */ js.Function3[Expiredate, /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "AccountInfo", js.Any.fromFunction2((t0: js.Object, t1: /* callback */ js.Function3[Expiredate, /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setCallMakeTTS(
          value: (Repeat, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "CallMakeTTS", js.Any.fromFunction2((t0: Repeat, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setCancel(
          value: (Messageid, /* callback */ js.Function3[js.Array[Status], /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "Cancel", js.Any.fromFunction2((t0: Messageid, t1: /* callback */ js.Function3[js.Array[Status], /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setCountInbox(
          value: (Linenumber, /* callback */ js.Function3[js.Array[EnddateStartdate], /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "CountInbox", js.Any.fromFunction2((t0: Linenumber, t1: /* callback */ js.Function3[js.Array[EnddateStartdate], /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setCountOutbox(
          value: (Startdate, /* callback */ js.Function3[js.Array[Sumcount], /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "CountOutbox", js.Any.fromFunction2((t0: Startdate, t1: /* callback */ js.Function3[js.Array[Sumcount], /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setCountPostalCode(
          value: (Any, /* callback */ js.Function3[Any, /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "CountPostalCode", js.Any.fromFunction2((t0: Any, t1: /* callback */ js.Function3[Any, /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setLatestOutbox(
          value: (Pagesize, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "LatestOutbox", js.Any.fromFunction2((t0: Pagesize, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setReceive(
          value: (Isread, /* callback */ js.Function3[js.Array[Message], /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "Receive", js.Any.fromFunction2((t0: Isread, t1: /* callback */ js.Function3[js.Array[Message], /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setRequest(value: (Actions, Methods, js.Object, Any) => Callback): Self = StObject.set(x, "request", js.Any.fromFunction4((t0: Actions, t1: Methods, t2: js.Object, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
        
        inline def setSelect(
          value: (Messageid, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "Select", js.Any.fromFunction2((t0: Messageid, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setSelectOutbox(
          value: (Enddate, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "SelectOutbox", js.Any.fromFunction2((t0: Enddate, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setSend(
          value: (Date, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "Send", js.Any.fromFunction2((t0: Date, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setSendArray(
          value: (Hide, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "SendArray", js.Any.fromFunction2((t0: Hide, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setSendByPostalCode(
          value: (Any, /* callback */ js.Function3[Any, /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "SendByPostalCode", js.Any.fromFunction2((t0: Any, t1: /* callback */ js.Function3[Any, /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setStatus(
          value: (Messageid, /* callback */ js.Function3[js.Array[Status], /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "Status", js.Any.fromFunction2((t0: Messageid, t1: /* callback */ js.Function3[js.Array[Status], /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setStatusLocalMessageid(
          value: (Localid, /* callback */ js.Function3[js.Array[Statustext], /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "StatusLocalMessageid", js.Any.fromFunction2((t0: Localid, t1: /* callback */ js.Function3[js.Array[Statustext], /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setVerifyLookup(
          value: (Receptor, /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => Callback
        ): Self = StObject.set(x, "VerifyLookup", js.Any.fromFunction2((t0: Receptor, t1: /* callback */ js.Function3[js.Array[Cost], /* status */ Double, /* message */ String, Unit]) => (value(t0, t1)).runNow()))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.kavenegar.kavenegarStrings.send
      - typingsJapgolly.kavenegar.kavenegarStrings.sendarray
      - typingsJapgolly.kavenegar.kavenegarStrings.status
      - typingsJapgolly.kavenegar.kavenegarStrings.statuslocalmessageid
      - typingsJapgolly.kavenegar.kavenegarStrings.select
      - typingsJapgolly.kavenegar.kavenegarStrings.selectoutbox
      - typingsJapgolly.kavenegar.kavenegarStrings.latestoutbox
      - typingsJapgolly.kavenegar.kavenegarStrings.countoutbox
      - typingsJapgolly.kavenegar.kavenegarStrings.cancel
      - typingsJapgolly.kavenegar.kavenegarStrings.receive
      - typingsJapgolly.kavenegar.kavenegarStrings.countinbox
      - typingsJapgolly.kavenegar.kavenegarStrings.countpostalcode
      - typingsJapgolly.kavenegar.kavenegarStrings.sendbypostalcode
      - typingsJapgolly.kavenegar.kavenegarStrings.lookup
      - typingsJapgolly.kavenegar.kavenegarStrings.info
      - typingsJapgolly.kavenegar.kavenegarStrings.config
      - typingsJapgolly.kavenegar.kavenegarStrings.maketts
    */
    trait Methods extends StObject
    object Methods {
      
      inline def cancel: typingsJapgolly.kavenegar.kavenegarStrings.cancel = "cancel".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.cancel]
      
      inline def config: typingsJapgolly.kavenegar.kavenegarStrings.config = "config".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.config]
      
      inline def countinbox: typingsJapgolly.kavenegar.kavenegarStrings.countinbox = "countinbox".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.countinbox]
      
      inline def countoutbox: typingsJapgolly.kavenegar.kavenegarStrings.countoutbox = "countoutbox".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.countoutbox]
      
      inline def countpostalcode: typingsJapgolly.kavenegar.kavenegarStrings.countpostalcode = "countpostalcode".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.countpostalcode]
      
      inline def info: typingsJapgolly.kavenegar.kavenegarStrings.info = "info".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.info]
      
      inline def latestoutbox: typingsJapgolly.kavenegar.kavenegarStrings.latestoutbox = "latestoutbox".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.latestoutbox]
      
      inline def lookup: typingsJapgolly.kavenegar.kavenegarStrings.lookup = "lookup".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.lookup]
      
      inline def maketts: typingsJapgolly.kavenegar.kavenegarStrings.maketts = "maketts".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.maketts]
      
      inline def receive: typingsJapgolly.kavenegar.kavenegarStrings.receive = "receive".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.receive]
      
      inline def select: typingsJapgolly.kavenegar.kavenegarStrings.select = "select".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.select]
      
      inline def selectoutbox: typingsJapgolly.kavenegar.kavenegarStrings.selectoutbox = "selectoutbox".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.selectoutbox]
      
      inline def send: typingsJapgolly.kavenegar.kavenegarStrings.send = "send".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.send]
      
      inline def sendarray: typingsJapgolly.kavenegar.kavenegarStrings.sendarray = "sendarray".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.sendarray]
      
      inline def sendbypostalcode: typingsJapgolly.kavenegar.kavenegarStrings.sendbypostalcode = "sendbypostalcode".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.sendbypostalcode]
      
      inline def status: typingsJapgolly.kavenegar.kavenegarStrings.status = "status".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.status]
      
      inline def statuslocalmessageid: typingsJapgolly.kavenegar.kavenegarStrings.statuslocalmessageid = "statuslocalmessageid".asInstanceOf[typingsJapgolly.kavenegar.kavenegarStrings.statuslocalmessageid]
    }
    
    trait Options extends StObject {
      
      var apikey: String
      
      var host: js.UndefOr[String] = js.undefined
      
      var version: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(apikey: String): Options = {
        val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
        
        inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    type ResponseK[T, Y] = js.Function2[
        /* data */ T, 
        /* callback */ js.Function3[/* entries */ Y, /* status */ Double, /* message */ String, Unit], 
        Unit
      ]
  }
}
