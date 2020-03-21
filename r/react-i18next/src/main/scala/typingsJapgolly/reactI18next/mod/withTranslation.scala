package typingsJapgolly.reactI18next.mod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactI18next.AnonWithRef
import typingsJapgolly.reactI18next.reactI18nextStrings.i18n
import typingsJapgolly.reactI18next.reactI18nextStrings.tReady
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-i18next", "withTranslation")
@js.native
object withTranslation extends js.Object {
  def apply(): js.Function1[
    /* component */ ComponentType[WithTranslation_], 
    ComponentType[Omit[WithTranslation_, i18n | tReady]]
  ] = js.native
  def apply(ns: Namespace): js.Function1[
    /* component */ ComponentType[WithTranslation_], 
    ComponentType[Omit[WithTranslation_, i18n | tReady]]
  ] = js.native
  def apply(ns: Namespace, options: AnonWithRef): js.Function1[
    /* component */ ComponentType[WithTranslation_], 
    ComponentType[Omit[WithTranslation_, i18n | tReady]]
  ] = js.native
}

