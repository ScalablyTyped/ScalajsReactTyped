package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.anon.PartialLifetimes
import typingsJapgolly.baiduApp.anon.PartialPageLifetimes
import typingsJapgolly.baiduApp.anon.PartialaddGlobalClassbool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Component组件参数
  */
/* Inlined parent std.Partial<baidu-app.swan.Lifetimes> */
trait ComponentOptions[Instance /* <: Component[Data, Props] */, Data, Methods, Props] extends StObject {
  
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 类似于mixins和traits的组件间代码复用机制
    * 参见 [behaviors](https://smartprogram.baidu.com/docs/develop/framework/custom-component_behaviors/)
    */
  var behaviors: js.UndefOr[
    js.Array[
      (ComponentOptions[
        Component[js.Object, js.Object], 
        DefaultData[Component[js.Object, js.Object]], 
        DefaultMethods[Component[js.Object, js.Object]], 
        PropsDefinition[DefaultProps]
      ]) | String
    ]
  ] = js.undefined
  
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 组件的内部数据，和 properties 一同用于组件的模版渲染
    */
  var data: js.UndefOr[Data] = js.undefined
  
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 组件接受的外部样式类，参见 外部样式类
    *
    * 有时，组件希望接受外部传入的样式类（类似于 view 组件的 hover-class 属性）。
    * 此时可以在 Component 中用 externalClasses 定义段定义若干个外部样式类。这个特性从小程序基础库版本 1.9.90 开始支持。
    *
    * @version 1.9.90
    */
  var externalClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 组件生命周期声明对象，组件的生命周期：created、attached、ready、moved、detached将收归到lifetimes字段内进行声明，
    * 原有声明方式仍旧有效，如同时存在两种声明方式，则lifetimes字段内声明方式优先级最高
    */
  var lifetimes: js.UndefOr[PartialLifetimes] = js.undefined
  
  /**
    * 组件的方法，包括事件响应函数和任意的自定义方法
    * 关于事件响应函数的使用
    * 参见[组件事件](https://smartprogram.baidu.com/docs/develop/framework/custom-component_cont/)
    */
  var methods: js.UndefOr[Methods] = js.undefined
  
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 一些组件选项，请参见文档其他部分的说明
    */
  var options: js.UndefOr[PartialaddGlobalClassbool] = js.undefined
  
  /**
    * 组件所在页面的生命周期声明对象，目前仅支持页面的show和hide两个生命周期
    */
  var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.undefined
  
  /**
    * 组件的对外属性，是属性名到属性设置的映射表
    * 属性设置中可包含三个字段:
    * type 表示属性类型、 value 表示属性初始值、 observer 表示属性值被更改时的响应函数
    */
  var properties: js.UndefOr[Props] = js.undefined
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ComponentOptions {
  
  inline def apply[Instance /* <: Component[Data, Props] */, Data, Methods, Props](): ComponentOptions[Instance, Data, Methods, Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[Instance, Data, Methods, Props]]
  }
  
  extension [Self <: ComponentOptions[?, ?, ?, ?], Instance /* <: Component[Data, Props] */, Data, Methods, Props](x: Self & (ComponentOptions[Instance, Data, Methods, Props])) {
    
    inline def setAttached(value: Callback): Self = StObject.set(x, "attached", value.toJsFn)
    
    inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
    
    inline def setBehaviors(
      value: js.Array[
          (ComponentOptions[
            Component[js.Object, js.Object], 
            DefaultData[Component[js.Object, js.Object]], 
            DefaultMethods[Component[js.Object, js.Object]], 
            PropsDefinition[DefaultProps]
          ]) | String
        ]
    ): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    inline def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
    
    inline def setBehaviorsVarargs(
      value: ((ComponentOptions[
          Component[js.Object, js.Object], 
          DefaultData[Component[js.Object, js.Object]], 
          DefaultMethods[Component[js.Object, js.Object]], 
          PropsDefinition[DefaultProps]
        ]) | String)*
    ): Self = StObject.set(x, "behaviors", js.Array(value*))
    
    inline def setCreated(value: Callback): Self = StObject.set(x, "created", value.toJsFn)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDetached(value: Callback): Self = StObject.set(x, "detached", value.toJsFn)
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setExternalClasses(value: js.Array[String]): Self = StObject.set(x, "externalClasses", value.asInstanceOf[js.Any])
    
    inline def setExternalClassesUndefined: Self = StObject.set(x, "externalClasses", js.undefined)
    
    inline def setExternalClassesVarargs(value: String*): Self = StObject.set(x, "externalClasses", js.Array(value*))
    
    inline def setLifetimes(value: PartialLifetimes): Self = StObject.set(x, "lifetimes", value.asInstanceOf[js.Any])
    
    inline def setLifetimesUndefined: Self = StObject.set(x, "lifetimes", js.undefined)
    
    inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMoved(value: Callback): Self = StObject.set(x, "moved", value.toJsFn)
    
    inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
    
    inline def setOptions(value: PartialaddGlobalClassbool): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPageLifetimes(value: PartialPageLifetimes): Self = StObject.set(x, "pageLifetimes", value.asInstanceOf[js.Any])
    
    inline def setPageLifetimesUndefined: Self = StObject.set(x, "pageLifetimes", js.undefined)
    
    inline def setProperties(value: Props): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReady(value: Callback): Self = StObject.set(x, "ready", value.toJsFn)
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
  }
}
