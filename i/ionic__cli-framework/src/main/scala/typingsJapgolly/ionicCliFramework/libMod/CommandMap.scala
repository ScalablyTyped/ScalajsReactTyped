package typingsJapgolly.ionicCliFramework.libMod

import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMapGetter
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionicUtilsObject.mod.AliasedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "CommandMap")
@js.native
class CommandMap ()
  extends AliasedMap[
      String, 
      CommandMapGetter[
        typingsJapgolly.ionicCliFramework.commandMod.Command, 
        typingsJapgolly.ionicCliFramework.commandMod.Namespace, 
        CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
        CommandMetadataInput, 
        CommandMetadataOption
      ]
    ]

