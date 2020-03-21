package typingsJapgolly.aframe.mod._Global_.AFRAME

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.aframe.mod.MinimalShaderDefinition
import typingsJapgolly.aframe.mod.ShaderConstructor
import typingsJapgolly.aframe.mod.ShaderDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.registerShader")
@js.native
object registerShader
  extends TopLevel[
      js.Function2[
        /* name */ String, 
        /* shader */ ShaderDefinition[MinimalShaderDefinition with js.Object], 
        ShaderConstructor[MinimalShaderDefinition with js.Object]
      ]
    ]

