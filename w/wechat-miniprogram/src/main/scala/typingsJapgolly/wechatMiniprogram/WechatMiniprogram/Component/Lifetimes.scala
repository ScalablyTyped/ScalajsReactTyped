package typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Component

import japgolly.scalajs.react.Callback
import typingsJapgolly.wechatMiniprogram.anon.Partialcreatedvoidattache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lifetimes extends StObject {
  
  /**
    * @deprecated 旧式的定义方式，基础库 `2.2.3` 起请在 lifetimes 中定义
    *
    * 在组件实例进入页面节点树时执行
    *
    * 最低基础库版本：[`1.6.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  def attached(): Unit
  
  /**
    * @deprecated 旧式的定义方式，基础库 `2.2.3` 起请在 lifetimes 中定义
    *
    * 在组件实例刚刚被创建时执行
    *
    * 最低基础库版本：[`1.6.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  def created(): Unit
  
  /**
    * @deprecated 旧式的定义方式，基础库 `2.2.3` 起请在 lifetimes 中定义
    *
    * 在组件实例被从页面节点树移除时执行
    *
    * 最低基础库版本：[`1.6.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  def detached(): Unit
  
  /**
    * @deprecated 旧式的定义方式，基础库 `2.2.3` 起请在 lifetimes 中定义
    *
    * 每当组件方法抛出错误时执行
    *
    * 最低基础库版本：[`2.4.1`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  def error(err: js.Error): Unit
  
  /** 组件生命周期声明对象，组件的生命周期：`created`、`attached`、`ready`、`moved`、`detached` 将收归到 `lifetimes` 字段内进行声明，原有声明方式仍旧有效，如同时存在两种声明方式，则 `lifetimes` 字段内声明方式优先级最高
    *
    * 最低基础库： `2.2.3` */
  var lifetimes: Partialcreatedvoidattache
  
  /**
    * @deprecated 旧式的定义方式，基础库 `2.2.3` 起请在 lifetimes 中定义
    *
    * 在组件实例被移动到节点树另一个位置时执行
    *
    * 最低基础库版本：[`1.6.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  def moved(): Unit
  
  /**
    * @deprecated 旧式的定义方式，基础库 `2.2.3` 起请在 lifetimes 中定义
    *
    * 在组件在视图层布局完成后执行
    *
    * 最低基础库版本：[`1.6.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  def ready(): Unit
}
object Lifetimes {
  
  inline def apply(
    attached: Callback,
    created: Callback,
    detached: Callback,
    error: js.Error => Callback,
    lifetimes: Partialcreatedvoidattache,
    moved: Callback,
    ready: Callback
  ): Lifetimes = {
    val __obj = js.Dynamic.literal(attached = attached.toJsFn, created = created.toJsFn, detached = detached.toJsFn, error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), lifetimes = lifetimes.asInstanceOf[js.Any], moved = moved.toJsFn, ready = ready.toJsFn)
    __obj.asInstanceOf[Lifetimes]
  }
  
  extension [Self <: Lifetimes](x: Self) {
    
    inline def setAttached(value: Callback): Self = StObject.set(x, "attached", value.toJsFn)
    
    inline def setCreated(value: Callback): Self = StObject.set(x, "created", value.toJsFn)
    
    inline def setDetached(value: Callback): Self = StObject.set(x, "detached", value.toJsFn)
    
    inline def setError(value: js.Error => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
    
    inline def setLifetimes(value: Partialcreatedvoidattache): Self = StObject.set(x, "lifetimes", value.asInstanceOf[js.Any])
    
    inline def setMoved(value: Callback): Self = StObject.set(x, "moved", value.toJsFn)
    
    inline def setReady(value: Callback): Self = StObject.set(x, "ready", value.toJsFn)
  }
}
