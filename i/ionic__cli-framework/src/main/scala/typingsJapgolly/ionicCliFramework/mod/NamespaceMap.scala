package typingsJapgolly.ionicCliFramework.mod

import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionicCliFramework.definitionsMod.NamespaceMapGetter
import typingsJapgolly.ionicUtilsObject.mod.AliasedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "NamespaceMap")
@js.native
class NamespaceMap ()
  extends AliasedMap[
      String, 
      NamespaceMapGetter[
        typingsJapgolly.ionicCliFramework.commandMod.Command, 
        typingsJapgolly.ionicCliFramework.commandMod.Namespace, 
        CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
        CommandMetadataInput, 
        CommandMetadataOption
      ]
    ]

