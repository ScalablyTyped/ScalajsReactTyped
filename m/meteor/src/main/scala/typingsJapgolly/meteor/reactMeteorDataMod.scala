package typingsJapgolly.meteor

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.DependencyList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/react-meteor-data", JSImport.Namespace)
@js.native
object reactMeteorDataMod extends js.Object {
  def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps]): TDataProps = js.native
  def useTracker[TDataProps](getMeteorData: js.Function0[TDataProps], deps: DependencyList): TDataProps = js.native
  def withTracker[TDataProps, TOwnProps](
    options: js.Function1[/* props */ TOwnProps, TDataProps | (AnonGetMeteorData[TOwnProps, TDataProps])]
  ): js.Function1[
    /* reactComponent */ ComponentType[TOwnProps with TDataProps], 
    ComponentClassP[TOwnProps with js.Object]
  ] = js.native
}

