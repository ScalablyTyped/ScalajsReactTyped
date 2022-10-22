package typingsJapgolly.interactjsTypes.actionsDropPluginMod

import typingsJapgolly.interactjsTypes.actionsDropPluginMod.^
import typingsJapgolly.interactjsTypes.anon.InteractableActions
import typingsJapgolly.interactjsTypes.coreScopeMod.Plugin
import typingsJapgolly.interactjsTypes.coreTypesMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: Plugin = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[Plugin]

type DropFunctionChecker = js.Function7[
/* dragEvent */ Any, 
/* event */ Any, 
/* dropped */ Boolean, 
/* dropzone */ InteractableActions, 
/* dropElement */ Element, 
/* draggable */ InteractableActions, 
/* draggableElement */ Element, 
Boolean]
