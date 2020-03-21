package typingsJapgolly.merkle.mod

import typingsJapgolly.merkle.merkleStrings.md5
import typingsJapgolly.merkle.merkleStrings.none
import typingsJapgolly.merkle.merkleStrings.ripemd160
import typingsJapgolly.merkle.merkleStrings.sha1
import typingsJapgolly.merkle.merkleStrings.sha256
import typingsJapgolly.merkle.merkleStrings.sha512
import typingsJapgolly.merkle.merkleStrings.whirlpool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("merkle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(hashname: md5): MerkleStream = js.native
  def apply(hashname: md5, useUpperCaseForHash: Boolean): MerkleStream = js.native
  def apply(hashname: none): MerkleStream = js.native
  def apply(hashname: none, useUpperCaseForHash: Boolean): MerkleStream = js.native
  def apply(hashname: ripemd160): MerkleStream = js.native
  def apply(hashname: ripemd160, useUpperCaseForHash: Boolean): MerkleStream = js.native
  def apply(hashname: sha1): MerkleStream = js.native
  def apply(hashname: sha1, useUpperCaseForHash: Boolean): MerkleStream = js.native
  def apply(hashname: sha256): MerkleStream = js.native
  def apply(hashname: sha256, useUpperCaseForHash: Boolean): MerkleStream = js.native
  def apply(hashname: sha512): MerkleStream = js.native
  def apply(hashname: sha512, useUpperCaseForHash: Boolean): MerkleStream = js.native
  def apply(hashname: whirlpool): MerkleStream = js.native
  def apply(hashname: whirlpool, useUpperCaseForHash: Boolean): MerkleStream = js.native
}

