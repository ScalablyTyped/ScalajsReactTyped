package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 组件生命周期声明对象，组件的生命周期：created、attached、ready、moved、detached将收归到lifetimes字段内进行声明，
	 * 原有声明方式仍旧有效，如同时存在两种声明方式，则lifetimes字段内声明方式优先级最高
	 */
trait Lifetimes extends js.Object {
  /**
  		 * 组件生命周期函数，在组件实例进入页面节点树时执行
  		 */
  def attached(): Unit
  /**
  		 * 组件生命周期函数，在组件实例进入页面节点树时执行
  		 * 注意此时不能调用 setData
  		 */
  def created(): Unit
  /**
  		 * 组件生命周期函数，在组件实例被从页面节点树移除时执行
  		 */
  def detached(): Unit
  /**
  		 * 组件生命周期函数，在组件实例被移动到节点树另一个位置时执行
  		 */
  def moved(): Unit
  /**
  		 * 组件生命周期函数，在组件布局完成后执行，此时可以获取节点信息
  		 * 使用 [SelectorQuery](https://mp.weixin.qq.com/debug/wxadoc/dev/api/wxml-nodes-info.html)
  		 */
  def ready(): Unit
}

object Lifetimes {
  @scala.inline
  def apply(attached: Callback, created: Callback, detached: Callback, moved: Callback, ready: Callback): Lifetimes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attached")(attached.toJsFn)
    __obj.updateDynamic("created")(created.toJsFn)
    __obj.updateDynamic("detached")(detached.toJsFn)
    __obj.updateDynamic("moved")(moved.toJsFn)
    __obj.updateDynamic("ready")(ready.toJsFn)
    __obj.asInstanceOf[Lifetimes]
  }
}

