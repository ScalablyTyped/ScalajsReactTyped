package typingsJapgolly.pulumiCloud.serviceMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceConstructor
  extends StObject
     with /**
  * Construct a new Service, which is one or more managed replicas of a group of one or more Containers.
  *
  * @param name The unique name of the service.
  * @param opts A bag of options that controls how this resource behaves.
  */
Instantiable2[/* name */ String, /* args */ ServiceArguments, Service]
     with Instantiable3[/* name */ String, /* args */ ServiceArguments, /* opts */ ResourceOptions, Service]
