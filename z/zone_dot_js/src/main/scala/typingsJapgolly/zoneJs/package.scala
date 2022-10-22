package typingsJapgolly.zoneJs

import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Patch Function to allow user define their own monkey patch module.
  */
type PatchFn = js.Function3[/* global */ Window, /* Zone */ ZoneType, /* api */ ZonePrivate, Unit]
