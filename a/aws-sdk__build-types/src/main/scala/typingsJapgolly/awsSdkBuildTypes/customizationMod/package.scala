package typingsJapgolly.awsSdkBuildTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object customizationMod {
  type ConfigurationDefinition = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.awsSdkBuildTypes.customizationMod.ConfigurationPropertyDefinition
  ]
  type CustomizationProvider = js.Function2[
    /* model */ typingsJapgolly.awsSdkBuildTypes.treeModelMod.TreeModel, 
    /* target */ typingsJapgolly.awsSdkBuildTypes.customizationMod.RuntimeTarget, 
    typingsJapgolly.awsSdkBuildTypes.customizationMod.ServiceCustomizationDefinition
  ]
}
