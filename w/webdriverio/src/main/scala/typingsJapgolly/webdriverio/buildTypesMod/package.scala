package typingsJapgolly.webdriverio.buildTypesMod

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.std.Record
import typingsJapgolly.wdioProtocols.buildTypesMod.ElementReference
import typingsJapgolly.wdioTypes.mod.FunctionProperties
import typingsJapgolly.webdriverio.buildUtilsInterceptionDevtoolsMod.default
import typingsJapgolly.webdriverio.webdriverioStrings.async
import typingsJapgolly.webdriverio.webdriverioStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CustomLocatorReturnValue = HTMLElement | js.Array[HTMLElement] | (NodeList[HTMLElement & Node])

type CustomStrategyFunction = js.Function1[/* args */ Any, ElementReference | js.Array[ElementReference]]

type ElementFunction = js.Function1[/* elem */ HTMLElement, js.Array[HTMLElement] | HTMLElement]

/**
  * WebdriverIO Mock definition
  */
type MockFunctions = FunctionProperties[default]

type MultiRemoteBrowserReferenceAsync = Record[String, Browser[async]]

type MultiRemoteBrowserReferenceSync = Record[String, Browser[sync]]

type MultiRemoteElementReferenceAsync = Record[String, Element[async]]

type MultiRemoteElementReferenceSync = Record[String, Element[sync]]

type Selector = String | ElementReference | ElementFunction | CustomStrategyReference

type TouchActionParameter = String | (js.Array[String | TouchAction]) | TouchAction

type TouchActions = TouchActionParameter | js.Array[TouchActionParameter]
