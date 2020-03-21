package typingsJapgolly.inversify

import typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsJapgolly.inversify.interfacesMod.interfaces.TargetType
import typingsJapgolly.inversify.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/target", JSImport.Namespace)
@js.native
object targetMod extends js.Object {
  @js.native
  class Target protected ()
    extends typingsJapgolly.inversify.interfacesMod.interfaces.Target {
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_]) = this()
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_], namedOrTagged: String) = this()
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_], namedOrTagged: Metadata) = this()
  }
  
}

