package typingsJapgolly.protonNative.mod

import typingsJapgolly.protonNative.anon.Description
import typingsJapgolly.protonNative.anon.Title
import typingsJapgolly.protonNative.mod.^
import typingsJapgolly.protonNative.protonNativeStrings.Error
import typingsJapgolly.protonNative.protonNativeStrings.Message
import typingsJapgolly.protonNative.protonNativeStrings.Open
import typingsJapgolly.protonNative.protonNativeStrings.Save
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Dialog(`type`: Open | Save): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Dialog")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
inline def Dialog(`type`: Message | Error, options: Description): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Dialog")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def Dialog(`type`: Message | Error, options: Title): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Dialog")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def Dialog_Unit(`type`: Message | Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Dialog")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def render(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
