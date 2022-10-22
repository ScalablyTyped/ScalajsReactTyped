package typingsJapgolly.wechatMiniprogram

import typingsJapgolly.std.Record
import typingsJapgolly.wechatMiniprogram.DB.DatabaseCommand
import typingsJapgolly.wechatMiniprogram.DB.IGeo
import typingsJapgolly.wechatMiniprogram.DB.IGeoIntersectsCommandOptions
import typingsJapgolly.wechatMiniprogram.DB.IGeoJSONLineString
import typingsJapgolly.wechatMiniprogram.DB.IGeoJSONMultiLineString
import typingsJapgolly.wechatMiniprogram.DB.IGeoJSONMultiPoint
import typingsJapgolly.wechatMiniprogram.DB.IGeoJSONMultiPolygon
import typingsJapgolly.wechatMiniprogram.DB.IGeoJSONPolygon
import typingsJapgolly.wechatMiniprogram.DB.IGeoNearCommandOptions
import typingsJapgolly.wechatMiniprogram.DB.IGeoWithinCommandOptions
import typingsJapgolly.wechatMiniprogram.DB.IRegExpConstructor
import typingsJapgolly.wechatMiniprogram.DB.IRegExpOptions
import typingsJapgolly.wechatMiniprogram.DB.IServerDateOptions
import typingsJapgolly.wechatMiniprogram.ICloud.ICDNFilePathSpec
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.App.Constructor
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.App.GetApp
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Console
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Page.GetCurrentPages
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Wx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("App")
  @js.native
  def App: Constructor = js.native
  inline def App_=(x: Constructor): Unit = js.Dynamic.global.updateDynamic("App")(x.asInstanceOf[js.Any])
  
  /** 注册一个 `behavior`，接受一个 `Object` 类型的参数。*/
  @JSGlobal("Behavior")
  @js.native
  def Behavior: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Behavior.Constructor = js.native
  inline def Behavior_=(x: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Behavior.Constructor): Unit = js.Dynamic.global.updateDynamic("Behavior")(x.asInstanceOf[js.Any])
  
  /** Component构造器可用于定义组件，调用Component构造器时可以指定组件的属性、数据、方法等。
    *
    * * 使用 `this.data` 可以获取内部数据和属性值，但不要直接修改它们，应使用 `setData` 修改。
    * * 生命周期函数无法在组件方法中通过 `this` 访问到。
    * * 属性名应避免以 data 开头，即不要命名成 `dataXyz` 这样的形式，因为在 WXML 中， `data-xyz=""` 会被作为节点 dataset 来处理，而不是组件属性。
    * * 在一个组件的定义和使用时，组件的属性名和 data 字段相互间都不能冲突（尽管它们位于不同的定义段中）。
    * * 从基础库 `2.0.9` 开始，对象类型的属性和 data 字段中可以包含函数类型的子字段，即可以通过对象类型的属性字段来传递函数。低于这一版本的基础库不支持这一特性。
    * * `bug` : 对于 type 为 Object 或 Array 的属性，如果通过该组件自身的 `this.setData` 来改变属性值的一个子字段，则依旧会触发属性 observer ，且 observer 接收到的 `newVal` 是变化的那个子字段的值， `oldVal` 为空， `changedPath` 包含子字段的字段名相关信息。
    */
  @JSGlobal("Component")
  @js.native
  def Component: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Component.Constructor = js.native
  inline def Component_=(x: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Component.Constructor): Unit = js.Dynamic.global.updateDynamic("Component")(x.asInstanceOf[js.Any])
  
  // === Database ===
  object DB {
    
    /**
      * A contract that all API provider must adhere to
      */
    @JSGlobal("DB.APIBaseContract")
    @js.native
    open class APIBaseContract[PromiseReturn, CallbackReturn, Param /* <: IAPIParam[Any] */, Context] ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.APIBaseContract[PromiseReturn, CallbackReturn, Param, Context] {
      
      /**
        * In case of callback-style invocation, this function will be called
        */
      /* CompleteClass */
      override def getCallbackReturn(param: Param, context: Context): CallbackReturn = js.native
      
      /* CompleteClass */
      override def getContext(param: Param): Context = js.native
      
      /* CompleteClass */
      override def getFinalParam[T /* <: Param */](param: Param, context: Context): T = js.native
      
      /* CompleteClass */
      override def run[T /* <: Param */](param: T): js.Promise[PromiseReturn] = js.native
    }
    
    @JSGlobal("DB.Batch")
    @js.native
    open class Batch ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.Batch
    
    @JSGlobal("DB.CollectionReference")
    @js.native
    open class CollectionReference protected ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.CollectionReference {
      /* private */ def this(name: String, database: typingsJapgolly.wechatMiniprogram.DB.Database) = this()
    }
    
    /**
      * The class of all exposed cloud database instances
      */
    @JSGlobal("DB.Database")
    @js.native
    /* private */ open class Database ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.Database {
      
      /* CompleteClass */
      override val Geo: IGeo = js.native
      
      /* CompleteClass */
      override def RegExp(options: IRegExpOptions): typingsJapgolly.wechatMiniprogram.DB.RegExp = js.native
      /* CompleteClass */
      @JSName("RegExp")
      override val RegExp_Original: IRegExpConstructor = js.native
      
      /* CompleteClass */
      override def collection(collectionName: String): typingsJapgolly.wechatMiniprogram.DB.CollectionReference = js.native
      
      /* CompleteClass */
      override val command: DatabaseCommand = js.native
      
      /* CompleteClass */
      override val config: ICloudConfig = js.native
      
      /* CompleteClass */
      override def serverDate(): typingsJapgolly.wechatMiniprogram.DB.ServerDate = js.native
    }
    
    @JSGlobal("DB.DatabaseAggregateCommand")
    @js.native
    open class DatabaseAggregateCommand ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.DatabaseAggregateCommand
    
    @JSGlobal("DB.DatabaseLogicCommand")
    @js.native
    open class DatabaseLogicCommand ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand {
      
      /* CompleteClass */
      override def and(expressions: typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand*): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def nor(expressions: typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand*): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def not(expression: typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def or(expressions: typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand*): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
    }
    
    @JSGlobal("DB.DatabaseProjectionCommand")
    @js.native
    open class DatabaseProjectionCommand ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.DatabaseProjectionCommand
    
    @JSGlobal("DB.DatabaseQueryCommand")
    @js.native
    open class DatabaseQueryCommand ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.DatabaseQueryCommand {
      
      /* CompleteClass */
      override def all(`val`: js.Array[Any]): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def and(expressions: typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand*): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def elemMatch(`val`: Any): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def exists(`val`: Boolean): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def geoIntersects(options: IGeoIntersectsCommandOptions): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def geoNear(options: IGeoNearCommandOptions): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def geoWithin(options: IGeoWithinCommandOptions): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def gt(`val`: Any): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def gte(`val`: Any): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def in(`val`: js.Array[Any]): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def lt(`val`: Any): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def lte(`val`: Any): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def mod(divisor: Double, remainder: Double): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def neq(`val`: Any): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def nin(`val`: js.Array[Any]): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def nor(expressions: typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand*): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def not(expression: typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def or(expressions: typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand*): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def size(`val`: Double): typingsJapgolly.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
    }
    
    @JSGlobal("DB.DatabaseUpdateCommand")
    @js.native
    open class DatabaseUpdateCommand ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.DatabaseUpdateCommand
    
    @JSGlobal("DB.DocumentReference")
    @js.native
    open class DocumentReference protected ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.DocumentReference {
      /* private */ def this(docId: String, database: typingsJapgolly.wechatMiniprogram.DB.Database) = this()
      /* private */ def this(docId: Double, database: typingsJapgolly.wechatMiniprogram.DB.Database) = this()
    }
    
    /* note: abstract class */ @JSGlobal("DB.GeoLineString")
    @js.native
    open class GeoLineString protected ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.GeoLineString {
      def this(points: js.Array[typingsJapgolly.wechatMiniprogram.DB.GeoPoint]) = this()
      
      /* CompleteClass */
      var points: js.Array[typingsJapgolly.wechatMiniprogram.DB.GeoPoint] = js.native
      
      /* CompleteClass */
      override def toJSON(): IGeoJSONLineString = js.native
    }
    
    /* note: abstract class */ @JSGlobal("DB.GeoMultiLineString")
    @js.native
    open class GeoMultiLineString protected ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.GeoMultiLineString {
      def this(lines: js.Array[typingsJapgolly.wechatMiniprogram.DB.GeoLineString]) = this()
      
      /* CompleteClass */
      var lines: js.Array[typingsJapgolly.wechatMiniprogram.DB.GeoLineString] = js.native
      
      /* CompleteClass */
      override def toJSON(): IGeoJSONMultiLineString = js.native
    }
    
    /* note: abstract class */ @JSGlobal("DB.GeoMultiPoint")
    @js.native
    open class GeoMultiPoint protected ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.GeoMultiPoint {
      def this(points: js.Array[typingsJapgolly.wechatMiniprogram.DB.GeoPoint]) = this()
      
      /* CompleteClass */
      var points: js.Array[typingsJapgolly.wechatMiniprogram.DB.GeoPoint] = js.native
      
      /* CompleteClass */
      override def toJSON(): IGeoJSONMultiPoint = js.native
    }
    
    /* note: abstract class */ @JSGlobal("DB.GeoMultiPolygon")
    @js.native
    open class GeoMultiPolygon protected ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.GeoMultiPolygon {
      def this(polygons: js.Array[typingsJapgolly.wechatMiniprogram.DB.GeoPolygon]) = this()
      
      /* CompleteClass */
      var polygons: js.Array[typingsJapgolly.wechatMiniprogram.DB.GeoPolygon] = js.native
      
      /* CompleteClass */
      override def toJSON(): IGeoJSONMultiPolygon = js.native
    }
    
    /* note: abstract class */ @JSGlobal("DB.GeoPoint")
    @js.native
    open class GeoPoint protected ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.GeoPoint {
      def this(longitude: Double, latitude: Double) = this()
      
      /* CompleteClass */
      var latitude: Double = js.native
      
      /* CompleteClass */
      var longitude: Double = js.native
      
      /* CompleteClass */
      override def toJSON(): Record[String, Any] = js.native
    }
    
    /* note: abstract class */ @JSGlobal("DB.GeoPolygon")
    @js.native
    open class GeoPolygon protected ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.GeoPolygon {
      def this(lines: js.Array[typingsJapgolly.wechatMiniprogram.DB.GeoLineString]) = this()
      
      /* CompleteClass */
      var lines: js.Array[typingsJapgolly.wechatMiniprogram.DB.GeoLineString] = js.native
      
      /* CompleteClass */
      override def toJSON(): IGeoJSONPolygon = js.native
    }
    
    @JSGlobal("DB.LOGIC_COMMANDS_LITERAL")
    @js.native
    object LOGIC_COMMANDS_LITERAL extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL & String] = js.native
      
      /* "and" */ val AND: typingsJapgolly.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL.AND & String = js.native
      
      /* "nor" */ val NOR: typingsJapgolly.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL.NOR & String = js.native
      
      /* "not" */ val NOT: typingsJapgolly.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL.NOT & String = js.native
      
      /* "or" */ val OR: typingsJapgolly.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL.OR & String = js.native
    }
    
    @JSGlobal("DB.PROJECTION_COMMANDS_LITERAL")
    @js.native
    object PROJECTION_COMMANDS_LITERAL extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.wechatMiniprogram.DB.PROJECTION_COMMANDS_LITERAL & String] = js.native
      
      /* "slice" */ val SLICE: typingsJapgolly.wechatMiniprogram.DB.PROJECTION_COMMANDS_LITERAL.SLICE & String = js.native
    }
    
    @JSGlobal("DB.QUERY_COMMANDS_LITERAL")
    @js.native
    object QUERY_COMMANDS_LITERAL extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL & String] = js.native
      
      /* "all" */ val ALL: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.ALL & String = js.native
      
      /* "elemMatch" */ val ELEM_MATCH: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.ELEM_MATCH & String = js.native
      
      /* "eq" */ val EQ: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.EQ & String = js.native
      
      /* "exists" */ val EXISTS: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.EXISTS & String = js.native
      
      /* "geoIntersects" */ val GEO_INTERSECTS: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GEO_INTERSECTS & String = js.native
      
      /* "geoNear" */ val GEO_NEAR: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GEO_NEAR & String = js.native
      
      /* "geoWithin" */ val GEO_WITHIN: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GEO_WITHIN & String = js.native
      
      /* "gt" */ val GT: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GT & String = js.native
      
      /* "gte" */ val GTE: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GTE & String = js.native
      
      /* "in" */ val IN: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.IN & String = js.native
      
      /* "lt" */ val LT: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.LT & String = js.native
      
      /* "lte" */ val LTE: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.LTE & String = js.native
      
      /* "mod" */ val MOD: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.MOD & String = js.native
      
      /* "neq" */ val NEQ: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.NEQ & String = js.native
      
      /* "nin" */ val NIN: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.NIN & String = js.native
      
      /* "size" */ val SIZE: typingsJapgolly.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.SIZE & String = js.native
    }
    
    @JSGlobal("DB.Query")
    @js.native
    open class Query ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.Query
    
    @JSGlobal("DB.RealtimeListener")
    @js.native
    open class RealtimeListener ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.RealtimeListener {
      
      // "And Now His Watch Is Ended"
      /* CompleteClass */
      override def close(): js.Promise[Unit] = js.native
    }
    
    /* note: abstract class */ @JSGlobal("DB.RegExp")
    @js.native
    open class RegExp protected ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.RegExp {
      def this(options: IRegExpOptions) = this()
      
      /* CompleteClass */
      override val options: String = js.native
      
      /* CompleteClass */
      override val regexp: String = js.native
    }
    
    /* note: abstract class */ @JSGlobal("DB.ServerDate")
    @js.native
    open class ServerDate ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.DB.ServerDate {
      def this(options: IServerDateOptions) = this()
      
      /* CompleteClass */
      override val options: IServerDateOptions = js.native
    }
    
    @JSGlobal("DB.UPDATE_COMMANDS_LITERAL")
    @js.native
    object UPDATE_COMMANDS_LITERAL extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL & String] = js.native
      
      /* "addToSet" */ val ADD_TO_SET: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.ADD_TO_SET & String = js.native
      
      /* "bit" */ val BIT: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.BIT & String = js.native
      
      /* "inc" */ val INC: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.INC & String = js.native
      
      /* "max" */ val MAX: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.MAX & String = js.native
      
      /* "min" */ val MIN: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.MIN & String = js.native
      
      /* "mul" */ val MUL: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.MUL & String = js.native
      
      /* "pop" */ val POP: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.POP & String = js.native
      
      /* "pull" */ val PULL: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.PULL & String = js.native
      
      /* "pullAll" */ val PULL_ALL: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.PULL_ALL & String = js.native
      
      /* "push" */ val PUSH: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.PUSH & String = js.native
      
      /* "remove" */ val REMOVE: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.REMOVE & String = js.native
      
      /* "rename" */ val RENAME: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.RENAME & String = js.native
      
      /* "set" */ val SET: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.SET & String = js.native
      
      /* "shift" */ val SHIFT: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.SHIFT & String = js.native
      
      /* "unshift" */ val UNSHIFT: typingsJapgolly.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.UNSHIFT & String = js.native
    }
  }
  
  object ICloud {
    
    // === end ===
    // === API: CDN ===
    /* note: abstract class */ @JSGlobal("ICloud.CDN")
    @js.native
    open class CDN protected ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.ICloud.CDN {
      def this(target: String) = this()
      def this(target: js.typedarray.ArrayBuffer) = this()
      def this(target: ICDNFilePathSpec) = this()
      
      /* CompleteClass */
      var target: String | js.typedarray.ArrayBuffer | ICDNFilePathSpec = js.native
    }
    
    // === end ===
    // === API: CloudID ===
    /* note: abstract class */ @JSGlobal("ICloud.CloudID")
    @js.native
    open class CloudID protected ()
      extends StObject
         with typingsJapgolly.wechatMiniprogram.ICloud.CloudID {
      def this(cloudID: String) = this()
    }
  }
  
  @JSGlobal("InternalSymbol")
  @js.native
  open class InternalSymbol ()
    extends StObject
       with typingsJapgolly.wechatMiniprogram.InternalSymbol
  
  /**
    * 注册小程序中的一个页面。接受一个 `Object` 类型参数，其指定页面的初始数据、生命周期回调、事件处理函数等。
    */
  @JSGlobal("Page")
  @js.native
  def Page: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Page.Constructor = js.native
  inline def Page_=(x: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Page.Constructor): Unit = js.Dynamic.global.updateDynamic("Page")(x.asInstanceOf[js.Any])
  
  /** [clearInterval(number intervalID)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/clearInterval.html)
    *
    * 取消由 setInterval 设置的定时器。 */
  inline def clearInterval(/** 要取消的定时器的 ID */
  intervalID: Double): Unit = js.Dynamic.global.applyDynamic("clearInterval")(intervalID.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [clearTimeout(number timeoutID)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/clearTimeout.html)
    *
    * 取消由 setTimeout 设置的定时器。 */
  inline def clearTimeout(/** 要取消的定时器的 ID */
  timeoutID: Double): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(timeoutID.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("console")
  @js.native
  def console: Console = js.native
  inline def console_=(x: Console): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])
  
  /** `module.exports` 的引用 */
  @JSGlobal("exports")
  @js.native
  def exports: Any = js.native
  inline def exports_=(x: Any): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
  
  @JSGlobal("getApp")
  @js.native
  def getApp: GetApp = js.native
  inline def getApp_=(x: GetApp): Unit = js.Dynamic.global.updateDynamic("getApp")(x.asInstanceOf[js.Any])
  
  /**
    * 获取当前页面栈。数组中第一个元素为首页，最后一个元素为当前页面。
    *  __注意：__
    *  - __不要尝试修改页面栈，会导致路由以及页面状态错误。__
    *  - 不要在 `App.onLaunch` 的时候调用 `getCurrentPages()`，此时 `page` 还没有生成。
    */
  @JSGlobal("getCurrentPages")
  @js.native
  def getCurrentPages: GetCurrentPages = js.native
  inline def getCurrentPages_=(x: GetCurrentPages): Unit = js.Dynamic.global.updateDynamic("getCurrentPages")(x.asInstanceOf[js.Any])
  
  /** 当前模块对象 */
  object module {
    
    @JSGlobal("module")
    @js.native
    val ^ : js.Any = js.native
    
    /** 模块向外暴露的对象，使用 `require` 引用该模块时可以获取 */
    @JSGlobal("module.exports")
    @js.native
    def exports: Any = js.native
    inline def exports_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exports")(x.asInstanceOf[js.Any])
  }
  
  /** 引入模块。返回模块通过 `module.exports` 或 `exports` 暴露的接口。 */
  inline def require(/** 需要引入模块文件相对于当前文件的相对路径，或 npm 模块名，或 npm 模块路径。不支持绝对路径 */
  module: String): Any = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** 插件引入当前使用者小程序。返回使用者小程序通过 [插件配置中 `export` 暴露的接口](https://developers.weixin.qq.com/miniprogram/dev/framework/plugin/using.html#%E5%AF%BC%E5%87%BA%E5%88%B0%E6%8F%92%E4%BB%B6)。
    *
    * 该接口只在插件中存在
    *
    * 最低基础库： `2.11.1` */
  inline def requireMiniProgram(): Any = js.Dynamic.global.applyDynamic("requireMiniProgram")().asInstanceOf[Any]
  
  /** 引入插件。返回插件通过 `main` 暴露的接口。 */
  inline def requirePlugin(/** 需要引入的插件的 alias */
  module: String): Any = js.Dynamic.global.applyDynamic("requirePlugin")(module.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [number setInterval(function callback, number delay, any rest)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/setInterval.html)
    *
    * 设定一个定时器。按照指定的周期（以毫秒计）来执行注册的回调函数 */
  inline def setInterval(/** 回调函数 */
  callback: js.Function1[/* repeated */ Any, Any]): Double = js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def setInterval(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ Any, Any],
    /** 执行回调函数之间的时间间隔，单位 ms。 */
  delay: Double
  ): Double = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def setInterval(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ Any, Any],
    /** 执行回调函数之间的时间间隔，单位 ms。 */
  delay: Double,
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: Any
  ): Double = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def setInterval(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ Any, Any],
    /** 执行回调函数之间的时间间隔，单位 ms。 */
  delay: Unit,
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: Any
  ): Double = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [number setTimeout(function callback, number delay, any rest)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/setTimeout.html)
    *
    * 设定一个定时器。在定时到期以后执行注册的回调函数 */
  inline def setTimeout(/** 回调函数 */
  callback: js.Function1[/* repeated */ Any, Any]): Double = js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def setTimeout(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ Any, Any],
    /** 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。 */
  delay: Double
  ): Double = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def setTimeout(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ Any, Any],
    /** 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。 */
  delay: Double,
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: Any
  ): Double = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def setTimeout(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ Any, Any],
    /** 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。 */
  delay: Unit,
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: Any
  ): Double = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSGlobal("wx")
  @js.native
  def wx: Wx = js.native
  inline def wx_=(x: Wx): Unit = js.Dynamic.global.updateDynamic("wx")(x.asInstanceOf[js.Any])
}
