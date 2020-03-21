package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import typingsJapgolly.storybookComponents.propDefMod.PropDef
import typingsJapgolly.storybookComponents.propsTableMod.PropsTableError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PropsTable {
  def PropsTableRowsProps(
    rows: js.Array[PropDef],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    typingsJapgolly.storybookComponents.propsTableMod.PropsTableRowsProps, 
    MountedWithRawType[
      typingsJapgolly.storybookComponents.propsTableMod.PropsTableRowsProps, 
      js.Object, 
      RawMounted[typingsJapgolly.storybookComponents.propsTableMod.PropsTableRowsProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.propsTableMod.PropsTableRowsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.propsTableMod.PropsTableRowsProps])(children: _*)
  }
  def PropsTableSectionsProps(
    sections: Record[String, js.Array[PropDef]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    typingsJapgolly.storybookComponents.propsTableMod.PropsTableSectionsProps, 
    MountedWithRawType[
      typingsJapgolly.storybookComponents.propsTableMod.PropsTableSectionsProps, 
      js.Object, 
      RawMounted[
        typingsJapgolly.storybookComponents.propsTableMod.PropsTableSectionsProps, 
        js.Object
      ]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (sections != null) __obj.updateDynamic("sections")(sections.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.propsTableMod.PropsTableSectionsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.propsTableMod.PropsTableSectionsProps])(children: _*)
  }
  def PropsTableErrorProps(
    error: PropsTableError,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    typingsJapgolly.storybookComponents.propsTableMod.PropsTableErrorProps, 
    MountedWithRawType[
      typingsJapgolly.storybookComponents.propsTableMod.PropsTableErrorProps, 
      js.Object, 
      RawMounted[typingsJapgolly.storybookComponents.propsTableMod.PropsTableErrorProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.propsTableMod.PropsTableErrorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.propsTableMod.PropsTableErrorProps])(children: _*)
  }
  @JSImport("@storybook/components", "PropsTable")
  @js.native
  object componentImport extends js.Object
  
}

