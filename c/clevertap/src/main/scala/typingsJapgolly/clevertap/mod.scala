package typingsJapgolly.clevertap

import typingsJapgolly.clevertap.anon.Body
import typingsJapgolly.clevertap.anon.Commonprofileproperties
import typingsJapgolly.clevertap.anon.Debug
import typingsJapgolly.clevertap.anon.Email
import typingsJapgolly.clevertap.anon.EvtData
import typingsJapgolly.clevertap.anon.FBID
import typingsJapgolly.clevertap.anon.From
import typingsJapgolly.clevertap.anon.Id
import typingsJapgolly.clevertap.anon.ProfileData
import typingsJapgolly.clevertap.clevertapStrings.GPID
import typingsJapgolly.clevertap.clevertapStrings.all
import typingsJapgolly.clevertap.clevertapStrings.campaign
import typingsJapgolly.clevertap.clevertapStrings.create
import typingsJapgolly.clevertap.clevertapStrings.custom
import typingsJapgolly.clevertap.clevertapStrings.email
import typingsJapgolly.clevertap.clevertapStrings.estimate
import typingsJapgolly.clevertap.clevertapStrings.identity
import typingsJapgolly.clevertap.clevertapStrings.list
import typingsJapgolly.clevertap.clevertapStrings.objectId
import typingsJapgolly.clevertap.clevertapStrings.result
import typingsJapgolly.clevertap.clevertapStrings.stop
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clevertap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait REGIONS extends StObject
  @JSImport("clevertap", "REGIONS")
  @js.native
  object REGIONS extends StObject {
    
    @js.native
    sealed trait EUROPE
      extends StObject
         with REGIONS
    
    @js.native
    sealed trait INDIA
      extends StObject
         with REGIONS
    
    @js.native
    sealed trait SINGAPORE
      extends StObject
         with REGIONS
    
    @js.native
    sealed trait US
      extends StObject
         with REGIONS
  }
  
  /**
    * @default region=REGIONS.EUROPE
    */
  inline def init(accountId: String, accountPasscode: String): CleverTap = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(accountId.asInstanceOf[js.Any], accountPasscode.asInstanceOf[js.Any])).asInstanceOf[CleverTap]
  inline def init(accountId: String, accountPasscode: String, region: REGIONS): CleverTap = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(accountId.asInstanceOf[js.Any], accountPasscode.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[CleverTap]
  
  type Callback = js.Function1[/* res */ Any, Unit]
  
  trait CampaignControlGroup extends StObject {
    
    var percentage: Double
    
    var `type`: campaign
  }
  object CampaignControlGroup {
    
    inline def apply(percentage: Double): CampaignControlGroup = {
      val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("campaign")
      __obj.asInstanceOf[CampaignControlGroup]
    }
    
    extension [Self <: CampaignControlGroup](x: Self) {
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setType(value: campaign): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CleverTap extends StObject {
    
    val TARGET_ACTIONS: js.Tuple5[create, estimate, list, result, stop] = js.native
    
    val TARGET_CREATE: create = js.native
    
    val TARGET_ESTIMATE: estimate = js.native
    
    val TARGET_LIST: list = js.native
    
    val TARGET_RESULT: result = js.native
    
    val TARGET_STOP: stop = js.native
    
    def events(query: Query): js.Promise[Any] = js.native
    def events(query: Query, options: Unit, callback: Callback): js.Promise[Any] = js.native
    def events(query: Query, options: QueryOptions): js.Promise[Any] = js.native
    def events(query: Query, options: QueryOptions, callback: Callback): js.Promise[Any] = js.native
    
    def profile(options: ProfileOptions): js.Promise[Any] = js.native
    def profile(options: ProfileOptions, callback: Callback): js.Promise[Any] = js.native
    
    def profiles(query: Query): js.Promise[Any] = js.native
    def profiles(query: Query, options: Unit, callback: Callback): js.Promise[Any] = js.native
    def profiles(query: Query, options: QueryOptions): js.Promise[Any] = js.native
    def profiles(query: Query, options: QueryOptions, callback: Callback): js.Promise[Any] = js.native
    
    def targets(action: stop | result, payload: Id): js.Promise[Any] = js.native
    def targets(action: stop | result, payload: Id, options: Unit, callback: Callback): js.Promise[Any] = js.native
    def targets(action: stop | result, payload: Id, options: TargetOptions): js.Promise[Any] = js.native
    def targets(action: stop | result, payload: Id, options: TargetOptions, callback: Callback): js.Promise[Any] = js.native
    def targets(action: create | estimate, payload: TargetCreatePayload): js.Promise[Any] = js.native
    def targets(action: create | estimate, payload: TargetCreatePayload, options: Unit, callback: Callback): js.Promise[Any] = js.native
    def targets(action: create | estimate, payload: TargetCreatePayload, options: TargetOptions): js.Promise[Any] = js.native
    def targets(
      action: create | estimate,
      payload: TargetCreatePayload,
      options: TargetOptions,
      callback: Callback
    ): js.Promise[Any] = js.native
    @JSName("targets")
    def targets_list(action: list, payload: From): js.Promise[Any] = js.native
    @JSName("targets")
    def targets_list(action: list, payload: From, options: Unit, callback: Callback): js.Promise[Any] = js.native
    @JSName("targets")
    def targets_list(action: list, payload: From, options: TargetOptions): js.Promise[Any] = js.native
    @JSName("targets")
    def targets_list(action: list, payload: From, options: TargetOptions, callback: Callback): js.Promise[Any] = js.native
    
    def upload(data: js.Array[UploadData]): js.Promise[Any] = js.native
    def upload(data: js.Array[UploadData], options: Unit, callback: Callback): js.Promise[Any] = js.native
    def upload(data: js.Array[UploadData], options: UploadOptions): js.Promise[Any] = js.native
    def upload(data: js.Array[UploadData], options: UploadOptions, callback: Callback): js.Promise[Any] = js.native
  }
  
  trait CustomControlGroup extends StObject {
    
    var name: String
    
    var `type`: custom
  }
  object CustomControlGroup {
    
    inline def apply(name: String): CustomControlGroup = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("custom")
      __obj.asInstanceOf[CustomControlGroup]
    }
    
    extension [Self <: CustomControlGroup](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type EventUploadData = EvtData & Identity
  
  type Identity = RequireAtLeastOne[FBID, identity | typingsJapgolly.clevertap.clevertapStrings.FBID | GPID | objectId]
  
  type ProfileIdentity = RequireAtLeastOne[Email, /* keyof clevertap.anon.Email */ email | identity | objectId]
  
  type ProfileOptions = Debug & ProfileIdentity
  
  type ProfileUploadData = ProfileData & Identity
  
  trait Query extends StObject {
    
    var event_name: String
    
    var from: Double
    
    var props: js.UndefOr[js.Array[Record[String, Any]]] = js.undefined
    
    var to: Double
  }
  object Query {
    
    inline def apply(event_name: String, from: Double, to: Double): Query = {
      val __obj = js.Dynamic.literal(event_name = event_name.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    extension [Self <: Query](x: Self) {
      
      inline def setEvent_name(value: String): Self = StObject.set(x, "event_name", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setProps(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setPropsVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "props", js.Array(value*))
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryOptions extends StObject {
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var debug: js.UndefOr[Double] = js.undefined
  }
  object QueryOptions {
    
    inline def apply(): QueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOptions]
    }
    
    extension [Self <: QueryOptions](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  type RequireAtLeastOne[T, Keys /* <: /* keyof T */ String */] = (Pick[T, Exclude[/* keyof T */ String, Keys]]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Required<std.Pick<T, K>> & std.Partial<std.Pick<T, std.Exclude<Keys, K>>>}[Keys] */ js.Any)
  
  trait TargetBasePayload extends StObject {
    
    var content: Body
    
    var control_group: js.UndefOr[CampaignControlGroup | CustomControlGroup] = js.undefined
    
    var devices: js.Array[String]
    
    var name: String
    
    var respect_throttle: js.UndefOr[Boolean] = js.undefined
    
    var send_to_all_devices: js.UndefOr[Boolean] = js.undefined
    
    var system_control_group_include: js.UndefOr[Boolean] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var when: String
    
    var wzrk_acts: js.UndefOr[String] = js.undefined
    
    var wzrk_bc: js.UndefOr[Double] = js.undefined
    
    var wzrk_bi: js.UndefOr[String] = js.undefined
    
    var wzrk_cid: js.UndefOr[String] = js.undefined
  }
  object TargetBasePayload {
    
    inline def apply(content: Body, devices: js.Array[String], name: String, when: String): TargetBasePayload = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], devices = devices.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetBasePayload]
    }
    
    extension [Self <: TargetBasePayload](x: Self) {
      
      inline def setContent(value: Body): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setControl_group(value: CampaignControlGroup | CustomControlGroup): Self = StObject.set(x, "control_group", value.asInstanceOf[js.Any])
      
      inline def setControl_groupUndefined: Self = StObject.set(x, "control_group", js.undefined)
      
      inline def setDevices(value: js.Array[String]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      inline def setDevicesVarargs(value: String*): Self = StObject.set(x, "devices", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRespect_throttle(value: Boolean): Self = StObject.set(x, "respect_throttle", value.asInstanceOf[js.Any])
      
      inline def setRespect_throttleUndefined: Self = StObject.set(x, "respect_throttle", js.undefined)
      
      inline def setSend_to_all_devices(value: Boolean): Self = StObject.set(x, "send_to_all_devices", value.asInstanceOf[js.Any])
      
      inline def setSend_to_all_devicesUndefined: Self = StObject.set(x, "send_to_all_devices", js.undefined)
      
      inline def setSystem_control_group_include(value: Boolean): Self = StObject.set(x, "system_control_group_include", value.asInstanceOf[js.Any])
      
      inline def setSystem_control_group_includeUndefined: Self = StObject.set(x, "system_control_group_include", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setWhen(value: String): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWzrk_acts(value: String): Self = StObject.set(x, "wzrk_acts", value.asInstanceOf[js.Any])
      
      inline def setWzrk_actsUndefined: Self = StObject.set(x, "wzrk_acts", js.undefined)
      
      inline def setWzrk_bc(value: Double): Self = StObject.set(x, "wzrk_bc", value.asInstanceOf[js.Any])
      
      inline def setWzrk_bcUndefined: Self = StObject.set(x, "wzrk_bc", js.undefined)
      
      inline def setWzrk_bi(value: String): Self = StObject.set(x, "wzrk_bi", value.asInstanceOf[js.Any])
      
      inline def setWzrk_biUndefined: Self = StObject.set(x, "wzrk_bi", js.undefined)
      
      inline def setWzrk_cid(value: String): Self = StObject.set(x, "wzrk_cid", value.asInstanceOf[js.Any])
      
      inline def setWzrk_cidUndefined: Self = StObject.set(x, "wzrk_cid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.clevertap.mod.TargetWherePayload
    - typingsJapgolly.clevertap.mod.TargetSegmentPayload
  */
  trait TargetCreatePayload extends StObject
  object TargetCreatePayload {
    
    inline def TargetSegmentPayload(content: Body, devices: js.Array[String], name: String, when: String): typingsJapgolly.clevertap.mod.TargetSegmentPayload = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], devices = devices.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], segment = "all", when = when.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.clevertap.mod.TargetSegmentPayload]
    }
    
    inline def TargetWherePayload(
      content: Body,
      devices: js.Array[String],
      name: String,
      when: String,
      where: Commonprofileproperties
    ): typingsJapgolly.clevertap.mod.TargetWherePayload = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], devices = devices.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.clevertap.mod.TargetWherePayload]
    }
  }
  
  trait TargetOptions extends StObject {
    
    var debug: js.UndefOr[Double] = js.undefined
  }
  object TargetOptions {
    
    inline def apply(): TargetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetOptions]
    }
    
    extension [Self <: TargetOptions](x: Self) {
      
      inline def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  trait TargetSegmentPayload
    extends StObject
       with TargetBasePayload
       with TargetCreatePayload {
    
    var segment: all
  }
  object TargetSegmentPayload {
    
    inline def apply(content: Body, devices: js.Array[String], name: String, when: String): TargetSegmentPayload = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], devices = devices.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], segment = "all", when = when.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetSegmentPayload]
    }
    
    extension [Self <: TargetSegmentPayload](x: Self) {
      
      inline def setSegment(value: all): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    }
  }
  
  trait TargetWherePayload
    extends StObject
       with TargetBasePayload
       with TargetCreatePayload {
    
    var where: Commonprofileproperties
  }
  object TargetWherePayload {
    
    inline def apply(
      content: Body,
      devices: js.Array[String],
      name: String,
      when: String,
      where: Commonprofileproperties
    ): TargetWherePayload = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], devices = devices.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetWherePayload]
    }
    
    extension [Self <: TargetWherePayload](x: Self) {
      
      inline def setWhere(value: Commonprofileproperties): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    }
  }
  
  type UploadData = ProfileUploadData | EventUploadData
  
  trait UploadOptions extends StObject {
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var debug: js.UndefOr[Double] = js.undefined
  }
  object UploadOptions {
    
    inline def apply(): UploadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadOptions]
    }
    
    extension [Self <: UploadOptions](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
}
