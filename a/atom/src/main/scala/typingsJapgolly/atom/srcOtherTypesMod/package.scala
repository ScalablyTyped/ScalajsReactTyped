package typingsJapgolly.atom.srcOtherTypesMod

import typingsJapgolly.atom.atomStrings.created
import typingsJapgolly.atom.atomStrings.deleted
import typingsJapgolly.atom.atomStrings.modified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type FilesystemChange = (FilesystemChangeBasic[created | modified | deleted]) | FilesystemChangeRename

type FilesystemChangeEvent = js.Array[FilesystemChange]

type TestRunner = js.Function1[/* params */ TestRunnerParams, js.Promise[Double]]
