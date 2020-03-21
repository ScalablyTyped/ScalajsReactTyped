package typingsJapgolly.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object choiceGroupOptionTypesMod {
  type OnChangeCallback = (js.Function2[
    /* evt */ js.UndefOr[
      japgolly.scalajs.react.ReactEventFrom[
        (org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.HTMLInputElement) with org.scalajs.dom.raw.Element
      ]
    ], 
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupOption], 
    scala.Unit
  ]) with (js.UndefOr[
    typingsJapgolly.react.mod.ChangeEventHandler[org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.HTMLInputElement]
  ])
  type OnFocusCallback = (js.Function2[
    /* ev */ js.UndefOr[
      japgolly.scalajs.react.ReactFocusEventFrom[
        (org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.HTMLInputElement) with org.scalajs.dom.raw.Element
      ]
    ], 
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupOption], 
    js.UndefOr[scala.Unit]
  ]) with (js.UndefOr[
    typingsJapgolly.react.mod.FocusEventHandler[org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.HTMLInputElement]
  ])
}
