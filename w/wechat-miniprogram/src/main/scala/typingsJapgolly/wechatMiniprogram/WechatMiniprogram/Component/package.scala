package typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Component

import typingsJapgolly.std.ArrayConstructor
import typingsJapgolly.std.BooleanConstructor
import typingsJapgolly.std.NumberConstructor
import typingsJapgolly.std.ObjectConstructor
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.std.StringConstructor
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.IAnyObject
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AllFullProperty = FullProperty[
ArrayConstructor | BooleanConstructor | Null | NumberConstructor | ObjectConstructor | StringConstructor]

type AllProperty = AllFullProperty | ShortProperty

type Constructor = js.Function1[
/* options */ Options[DataOption, PropertyOption, MethodOption, js.Object, `false`], 
String]

type DataOption = Record[String, Any]

type FullPropertyToData[T /* <: AllFullProperty */] = ValueType[
/* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any]

type Instance[TData /* <: DataOption */, TProperty /* <: PropertyOption */, TMethod /* <: Partial[MethodOption] */, TCustomInstanceProperty /* <: IAnyObject */, TIsPage /* <: Boolean */] = InstanceProperties & InstanceMethods[TData] & TMethod & (/* import warning: importer.ImportType#apply Failed type conversion: TIsPage extends true ? wechat-miniprogram.WechatMiniprogram.Page.ILifetime : {} */ js.Any) & TCustomInstanceProperty & (typingsJapgolly.wechatMiniprogram.anon.Data[TData, TProperty])

// tslint:disable-next-line:ban-types
type MethodOption = Record[String, js.Function]

type PropertyOption = Record[String, AllProperty]

type PropertyType = StringConstructor | NumberConstructor | BooleanConstructor | ArrayConstructor | ObjectConstructor | Null

type ShortProperty = StringConstructor | NumberConstructor | BooleanConstructor | ArrayConstructor | ObjectConstructor | Null

type TrivialInstance = Instance[IAnyObject, IAnyObject, IAnyObject, IAnyObject, `false`]
