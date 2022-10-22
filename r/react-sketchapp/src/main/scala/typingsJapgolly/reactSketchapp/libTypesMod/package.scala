package typingsJapgolly.reactSketchapp.libTypesMod

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.InferType
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.reactSketchapp.anon.AlignContent
import typingsJapgolly.reactSketchapp.anon.AlignSelf
import typingsJapgolly.reactSketchapp.reactSketchappStrings.dashed
import typingsJapgolly.reactSketchapp.reactSketchappStrings.dotted
import typingsJapgolly.reactSketchapp.reactSketchappStrings.hidden
import typingsJapgolly.reactSketchapp.reactSketchappStrings.scroll
import typingsJapgolly.reactSketchapp.reactSketchappStrings.solid
import typingsJapgolly.reactSketchapp.reactSketchappStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BorderStyle = InferType[Requireable[dashed | dotted | solid]]

type Color = InferType[Requireable[String | Double]]

type MSColor = Any

type MSGradient = Any

type NSString = Any

type Overflow = InferType[Requireable[hidden | visible | scroll]]

type SketchLayer = Any

type SketchStyle = Any

type TextStyle = InferProps[AlignSelf] & typingsJapgolly.reactSketchapp.anon.Color

type ViewStyle = InferProps[AlignContent] & typingsJapgolly.reactSketchapp.anon.Color
