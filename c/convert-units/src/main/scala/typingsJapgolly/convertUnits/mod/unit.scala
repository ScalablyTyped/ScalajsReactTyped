package typingsJapgolly.convertUnits.mod

import typingsJapgolly.convertUnits.convertUnitsStrings.Gb_
import typingsJapgolly.convertUnits.convertUnitsStrings.Kb_
import typingsJapgolly.convertUnits.convertUnitsStrings.Mb_
import typingsJapgolly.convertUnits.convertUnitsStrings.Tb_
import typingsJapgolly.convertUnits.convertUnitsStrings.b_
import typingsJapgolly.convertUnits.convertUnitsStrings.km_
import typingsJapgolly.convertUnits.convertUnitsStrings.mHz_
import typingsJapgolly.convertUnits.convertUnitsStrings.mVAR_
import typingsJapgolly.convertUnits.convertUnitsStrings.mVARh_
import typingsJapgolly.convertUnits.convertUnitsStrings.mVA_
import typingsJapgolly.convertUnits.convertUnitsStrings.mW_
import typingsJapgolly.convertUnits.convertUnitsStrings.mWh_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.convertUnits.convertUnitsStrings.mm
  - typingsJapgolly.convertUnits.convertUnitsStrings.cm
  - typingsJapgolly.convertUnits.convertUnitsStrings.m
  - typingsJapgolly.convertUnits.convertUnitsStrings.km_
  - typingsJapgolly.convertUnits.convertUnitsStrings.in
  - typingsJapgolly.convertUnits.convertUnitsStrings.`ft-us`
  - typingsJapgolly.convertUnits.convertUnitsStrings.ft
  - typingsJapgolly.convertUnits.convertUnitsStrings.mi
  - typingsJapgolly.convertUnits.convertUnitsStrings.mm2
  - typingsJapgolly.convertUnits.convertUnitsStrings.cm2
  - typingsJapgolly.convertUnits.convertUnitsStrings.m2
  - typingsJapgolly.convertUnits.convertUnitsStrings.ha
  - typingsJapgolly.convertUnits.convertUnitsStrings.km2
  - typingsJapgolly.convertUnits.convertUnitsStrings.in2
  - typingsJapgolly.convertUnits.convertUnitsStrings.ft2
  - typingsJapgolly.convertUnits.convertUnitsStrings.ac
  - typingsJapgolly.convertUnits.convertUnitsStrings.mi2
  - typingsJapgolly.convertUnits.convertUnitsStrings.mcg
  - typingsJapgolly.convertUnits.convertUnitsStrings.mg
  - typingsJapgolly.convertUnits.convertUnitsStrings.g
  - typingsJapgolly.convertUnits.convertUnitsStrings.kg
  - typingsJapgolly.convertUnits.convertUnitsStrings.oz
  - typingsJapgolly.convertUnits.convertUnitsStrings.lb
  - typingsJapgolly.convertUnits.convertUnitsStrings.mt
  - typingsJapgolly.convertUnits.convertUnitsStrings.t
  - typingsJapgolly.convertUnits.convertUnitsStrings.mm3
  - typingsJapgolly.convertUnits.convertUnitsStrings.cm3
  - typingsJapgolly.convertUnits.convertUnitsStrings.ml
  - typingsJapgolly.convertUnits.convertUnitsStrings.l
  - typingsJapgolly.convertUnits.convertUnitsStrings.kl
  - typingsJapgolly.convertUnits.convertUnitsStrings.m3
  - typingsJapgolly.convertUnits.convertUnitsStrings.km3
  - typingsJapgolly.convertUnits.convertUnitsStrings.tsp
  - typingsJapgolly.convertUnits.convertUnitsStrings.Tbs
  - typingsJapgolly.convertUnits.convertUnitsStrings.in3
  - typingsJapgolly.convertUnits.convertUnitsStrings.`fl-oz`
  - typingsJapgolly.convertUnits.convertUnitsStrings.cup
  - typingsJapgolly.convertUnits.convertUnitsStrings.pnt
  - typingsJapgolly.convertUnits.convertUnitsStrings.qt
  - typingsJapgolly.convertUnits.convertUnitsStrings.gal
  - typingsJapgolly.convertUnits.convertUnitsStrings.ft3
  - typingsJapgolly.convertUnits.convertUnitsStrings.yd3
  - typingsJapgolly.convertUnits.convertUnitsStrings.mm3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.cm3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.mlSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.clSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.dlSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.lSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.lSlashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.lSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.klSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.klSlashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.klSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.km3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.tspSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.TbsSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashs`
  - typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashmin`
  - typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashh`
  - typingsJapgolly.convertUnits.convertUnitsStrings.cupSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.qtSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.galSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.galSlashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.galSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.C
  - typingsJapgolly.convertUnits.convertUnitsStrings.F
  - typingsJapgolly.convertUnits.convertUnitsStrings.K
  - typingsJapgolly.convertUnits.convertUnitsStrings.R
  - typingsJapgolly.convertUnits.convertUnitsStrings.ns
  - typingsJapgolly.convertUnits.convertUnitsStrings.mu
  - typingsJapgolly.convertUnits.convertUnitsStrings.ms
  - typingsJapgolly.convertUnits.convertUnitsStrings.s
  - typingsJapgolly.convertUnits.convertUnitsStrings.min
  - typingsJapgolly.convertUnits.convertUnitsStrings.h
  - typingsJapgolly.convertUnits.convertUnitsStrings.d
  - typingsJapgolly.convertUnits.convertUnitsStrings.week
  - typingsJapgolly.convertUnits.convertUnitsStrings.month
  - typingsJapgolly.convertUnits.convertUnitsStrings.year
  - typingsJapgolly.convertUnits.convertUnitsStrings.Hz
  - typingsJapgolly.convertUnits.convertUnitsStrings.mHz_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kHz
  - typingsJapgolly.convertUnits.convertUnitsStrings.MHz
  - typingsJapgolly.convertUnits.convertUnitsStrings.GHz
  - typingsJapgolly.convertUnits.convertUnitsStrings.THz
  - typingsJapgolly.convertUnits.convertUnitsStrings.rpm
  - typingsJapgolly.convertUnits.convertUnitsStrings.degSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.radSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.mSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.kmSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.mSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.knot
  - typingsJapgolly.convertUnits.convertUnitsStrings.ftSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.sSlashm
  - typingsJapgolly.convertUnits.convertUnitsStrings.minSlashkm
  - typingsJapgolly.convertUnits.convertUnitsStrings.sSlashft
  - typingsJapgolly.convertUnits.convertUnitsStrings.Pa
  - typingsJapgolly.convertUnits.convertUnitsStrings.hPa
  - typingsJapgolly.convertUnits.convertUnitsStrings.kPa
  - typingsJapgolly.convertUnits.convertUnitsStrings.MPa
  - typingsJapgolly.convertUnits.convertUnitsStrings.bar
  - typingsJapgolly.convertUnits.convertUnitsStrings.torr
  - typingsJapgolly.convertUnits.convertUnitsStrings.psi
  - typingsJapgolly.convertUnits.convertUnitsStrings.ksi
  - typingsJapgolly.convertUnits.convertUnitsStrings.b_
  - typingsJapgolly.convertUnits.convertUnitsStrings.Kb_
  - typingsJapgolly.convertUnits.convertUnitsStrings.Mb_
  - typingsJapgolly.convertUnits.convertUnitsStrings.Gb_
  - typingsJapgolly.convertUnits.convertUnitsStrings.Tb_
  - typingsJapgolly.convertUnits.convertUnitsStrings.B
  - typingsJapgolly.convertUnits.convertUnitsStrings.KB
  - typingsJapgolly.convertUnits.convertUnitsStrings.MB
  - typingsJapgolly.convertUnits.convertUnitsStrings.GB
  - typingsJapgolly.convertUnits.convertUnitsStrings.TB
  - typingsJapgolly.convertUnits.convertUnitsStrings.lx
  - typingsJapgolly.convertUnits.convertUnitsStrings.`ft-cd`
  - typingsJapgolly.convertUnits.convertUnitsStrings.ppm
  - typingsJapgolly.convertUnits.convertUnitsStrings.ppb
  - typingsJapgolly.convertUnits.convertUnitsStrings.ppt
  - typingsJapgolly.convertUnits.convertUnitsStrings.ppq
  - typingsJapgolly.convertUnits.convertUnitsStrings.V
  - typingsJapgolly.convertUnits.convertUnitsStrings.mV
  - typingsJapgolly.convertUnits.convertUnitsStrings.kV
  - typingsJapgolly.convertUnits.convertUnitsStrings.A
  - typingsJapgolly.convertUnits.convertUnitsStrings.mA
  - typingsJapgolly.convertUnits.convertUnitsStrings.kA
  - typingsJapgolly.convertUnits.convertUnitsStrings.W
  - typingsJapgolly.convertUnits.convertUnitsStrings.mW_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kM
  - typingsJapgolly.convertUnits.convertUnitsStrings.MW
  - typingsJapgolly.convertUnits.convertUnitsStrings.GW
  - typingsJapgolly.convertUnits.convertUnitsStrings.VA
  - typingsJapgolly.convertUnits.convertUnitsStrings.mVA_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kVA
  - typingsJapgolly.convertUnits.convertUnitsStrings.MVA
  - typingsJapgolly.convertUnits.convertUnitsStrings.GVA
  - typingsJapgolly.convertUnits.convertUnitsStrings.VAR
  - typingsJapgolly.convertUnits.convertUnitsStrings.mVAR_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kVAR
  - typingsJapgolly.convertUnits.convertUnitsStrings.MVAR
  - typingsJapgolly.convertUnits.convertUnitsStrings.GVAR
  - typingsJapgolly.convertUnits.convertUnitsStrings.Wh
  - typingsJapgolly.convertUnits.convertUnitsStrings.mWh_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kWh
  - typingsJapgolly.convertUnits.convertUnitsStrings.MWh
  - typingsJapgolly.convertUnits.convertUnitsStrings.GWh
  - typingsJapgolly.convertUnits.convertUnitsStrings.J
  - typingsJapgolly.convertUnits.convertUnitsStrings.kJ
  - typingsJapgolly.convertUnits.convertUnitsStrings.VARh
  - typingsJapgolly.convertUnits.convertUnitsStrings.mVARh_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kVARh
  - typingsJapgolly.convertUnits.convertUnitsStrings.MVARh
  - typingsJapgolly.convertUnits.convertUnitsStrings.GVARH
  - typingsJapgolly.convertUnits.convertUnitsStrings.deg
  - typingsJapgolly.convertUnits.convertUnitsStrings.rad
  - typingsJapgolly.convertUnits.convertUnitsStrings.grad
  - typingsJapgolly.convertUnits.convertUnitsStrings.arcmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.arcsec
*/
trait unit extends js.Object

object unit {
  @scala.inline
  def A: typingsJapgolly.convertUnits.convertUnitsStrings.A = this.cast("A")
  @scala.inline
  def B: typingsJapgolly.convertUnits.convertUnitsStrings.B = this.cast("B")
  @scala.inline
  def C: typingsJapgolly.convertUnits.convertUnitsStrings.C = this.cast("C")
  @scala.inline
  def F: typingsJapgolly.convertUnits.convertUnitsStrings.F = this.cast("F")
  @scala.inline
  def GB: typingsJapgolly.convertUnits.convertUnitsStrings.GB = this.cast("GB")
  @scala.inline
  def GHz: typingsJapgolly.convertUnits.convertUnitsStrings.GHz = this.cast("GHz")
  @scala.inline
  def GVA: typingsJapgolly.convertUnits.convertUnitsStrings.GVA = this.cast("GVA")
  @scala.inline
  def GVAR: typingsJapgolly.convertUnits.convertUnitsStrings.GVAR = this.cast("GVAR")
  @scala.inline
  def GVARH: typingsJapgolly.convertUnits.convertUnitsStrings.GVARH = this.cast("GVARH")
  @scala.inline
  def GW: typingsJapgolly.convertUnits.convertUnitsStrings.GW = this.cast("GW")
  @scala.inline
  def GWh: typingsJapgolly.convertUnits.convertUnitsStrings.GWh = this.cast("GWh")
  @scala.inline
  def Gb: Gb_ = this.cast("Gb")
  @scala.inline
  def Hz: typingsJapgolly.convertUnits.convertUnitsStrings.Hz = this.cast("Hz")
  @scala.inline
  def J: typingsJapgolly.convertUnits.convertUnitsStrings.J = this.cast("J")
  @scala.inline
  def K: typingsJapgolly.convertUnits.convertUnitsStrings.K = this.cast("K")
  @scala.inline
  def KB: typingsJapgolly.convertUnits.convertUnitsStrings.KB = this.cast("KB")
  @scala.inline
  def Kb: Kb_ = this.cast("Kb")
  @scala.inline
  def MB: typingsJapgolly.convertUnits.convertUnitsStrings.MB = this.cast("MB")
  @scala.inline
  def MHz: typingsJapgolly.convertUnits.convertUnitsStrings.MHz = this.cast("MHz")
  @scala.inline
  def MPa: typingsJapgolly.convertUnits.convertUnitsStrings.MPa = this.cast("MPa")
  @scala.inline
  def MVA: typingsJapgolly.convertUnits.convertUnitsStrings.MVA = this.cast("MVA")
  @scala.inline
  def MVAR: typingsJapgolly.convertUnits.convertUnitsStrings.MVAR = this.cast("MVAR")
  @scala.inline
  def MVARh: typingsJapgolly.convertUnits.convertUnitsStrings.MVARh = this.cast("MVARh")
  @scala.inline
  def MW: typingsJapgolly.convertUnits.convertUnitsStrings.MW = this.cast("MW")
  @scala.inline
  def MWh: typingsJapgolly.convertUnits.convertUnitsStrings.MWh = this.cast("MWh")
  @scala.inline
  def Mb: Mb_ = this.cast("Mb")
  @scala.inline
  def Pa: typingsJapgolly.convertUnits.convertUnitsStrings.Pa = this.cast("Pa")
  @scala.inline
  def R: typingsJapgolly.convertUnits.convertUnitsStrings.R = this.cast("R")
  @scala.inline
  def TB: typingsJapgolly.convertUnits.convertUnitsStrings.TB = this.cast("TB")
  @scala.inline
  def THz: typingsJapgolly.convertUnits.convertUnitsStrings.THz = this.cast("THz")
  @scala.inline
  def Tb: Tb_ = this.cast("Tb")
  @scala.inline
  def Tbs: typingsJapgolly.convertUnits.convertUnitsStrings.Tbs = this.cast("Tbs")
  @scala.inline
  def TbsSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.TbsSlashs = this.cast("Tbs/s")
  @scala.inline
  def V: typingsJapgolly.convertUnits.convertUnitsStrings.V = this.cast("V")
  @scala.inline
  def VA: typingsJapgolly.convertUnits.convertUnitsStrings.VA = this.cast("VA")
  @scala.inline
  def VAR: typingsJapgolly.convertUnits.convertUnitsStrings.VAR = this.cast("VAR")
  @scala.inline
  def VARh: typingsJapgolly.convertUnits.convertUnitsStrings.VARh = this.cast("VARh")
  @scala.inline
  def W: typingsJapgolly.convertUnits.convertUnitsStrings.W = this.cast("W")
  @scala.inline
  def Wh: typingsJapgolly.convertUnits.convertUnitsStrings.Wh = this.cast("Wh")
  @scala.inline
  def ac: typingsJapgolly.convertUnits.convertUnitsStrings.ac = this.cast("ac")
  @scala.inline
  def arcmin: typingsJapgolly.convertUnits.convertUnitsStrings.arcmin = this.cast("arcmin")
  @scala.inline
  def arcsec: typingsJapgolly.convertUnits.convertUnitsStrings.arcsec = this.cast("arcsec")
  @scala.inline
  def b: b_ = this.cast("b")
  @scala.inline
  def bar: typingsJapgolly.convertUnits.convertUnitsStrings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.clSlashs = this.cast("cl/s")
  @scala.inline
  def cm: typingsJapgolly.convertUnits.convertUnitsStrings.cm = this.cast("cm")
  @scala.inline
  def cm2: typingsJapgolly.convertUnits.convertUnitsStrings.cm2 = this.cast("cm2")
  @scala.inline
  def cm3: typingsJapgolly.convertUnits.convertUnitsStrings.cm3 = this.cast("cm3")
  @scala.inline
  def cm3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.cm3Slashs = this.cast("cm3/s")
  @scala.inline
  def cup: typingsJapgolly.convertUnits.convertUnitsStrings.cup = this.cast("cup")
  @scala.inline
  def cupSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.cupSlashs = this.cast("cup/s")
  @scala.inline
  def d: typingsJapgolly.convertUnits.convertUnitsStrings.d = this.cast("d")
  @scala.inline
  def deg: typingsJapgolly.convertUnits.convertUnitsStrings.deg = this.cast("deg")
  @scala.inline
  def degSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.degSlashs = this.cast("deg/s")
  @scala.inline
  def dlSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.dlSlashs = this.cast("dl/s")
  @scala.inline
  def `fl-oz`: typingsJapgolly.convertUnits.convertUnitsStrings.`fl-oz` = this.cast("fl-oz")
  @scala.inline
  def `fl-ozSlashh`: typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashh` = this.cast("fl-oz/h")
  @scala.inline
  def `fl-ozSlashmin`: typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashmin` = this.cast("fl-oz/min")
  @scala.inline
  def `fl-ozSlashs`: typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashs` = this.cast("fl-oz/s")
  @scala.inline
  def ft: typingsJapgolly.convertUnits.convertUnitsStrings.ft = this.cast("ft")
  @scala.inline
  def `ft-cd`: typingsJapgolly.convertUnits.convertUnitsStrings.`ft-cd` = this.cast("ft-cd")
  @scala.inline
  def `ft-us`: typingsJapgolly.convertUnits.convertUnitsStrings.`ft-us` = this.cast("ft-us")
  @scala.inline
  def ft2: typingsJapgolly.convertUnits.convertUnitsStrings.ft2 = this.cast("ft2")
  @scala.inline
  def ft3: typingsJapgolly.convertUnits.convertUnitsStrings.ft3 = this.cast("ft3")
  @scala.inline
  def ft3Slashh: typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashh = this.cast("ft3/h")
  @scala.inline
  def ft3Slashmin: typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashmin = this.cast("ft3/min")
  @scala.inline
  def ft3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashs = this.cast("ft3/s")
  @scala.inline
  def ftSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.ftSlashs = this.cast("ft/s")
  @scala.inline
  def g: typingsJapgolly.convertUnits.convertUnitsStrings.g = this.cast("g")
  @scala.inline
  def gal: typingsJapgolly.convertUnits.convertUnitsStrings.gal = this.cast("gal")
  @scala.inline
  def galSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.galSlashh = this.cast("gal/h")
  @scala.inline
  def galSlashmin: typingsJapgolly.convertUnits.convertUnitsStrings.galSlashmin = this.cast("gal/min")
  @scala.inline
  def galSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.galSlashs = this.cast("gal/s")
  @scala.inline
  def grad: typingsJapgolly.convertUnits.convertUnitsStrings.grad = this.cast("grad")
  @scala.inline
  def h: typingsJapgolly.convertUnits.convertUnitsStrings.h = this.cast("h")
  @scala.inline
  def hPa: typingsJapgolly.convertUnits.convertUnitsStrings.hPa = this.cast("hPa")
  @scala.inline
  def ha: typingsJapgolly.convertUnits.convertUnitsStrings.ha = this.cast("ha")
  @scala.inline
  def in: typingsJapgolly.convertUnits.convertUnitsStrings.in = this.cast("in")
  @scala.inline
  def in2: typingsJapgolly.convertUnits.convertUnitsStrings.in2 = this.cast("in2")
  @scala.inline
  def in3: typingsJapgolly.convertUnits.convertUnitsStrings.in3 = this.cast("in3")
  @scala.inline
  def in3Slashh: typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashh = this.cast("in3/h")
  @scala.inline
  def in3Slashmin: typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashmin = this.cast("in3/min")
  @scala.inline
  def in3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashs = this.cast("in3/s")
  @scala.inline
  def kA: typingsJapgolly.convertUnits.convertUnitsStrings.kA = this.cast("kA")
  @scala.inline
  def kHz: typingsJapgolly.convertUnits.convertUnitsStrings.kHz = this.cast("kHz")
  @scala.inline
  def kJ: typingsJapgolly.convertUnits.convertUnitsStrings.kJ = this.cast("kJ")
  @scala.inline
  def kM: typingsJapgolly.convertUnits.convertUnitsStrings.kM = this.cast("kM")
  @scala.inline
  def kPa: typingsJapgolly.convertUnits.convertUnitsStrings.kPa = this.cast("kPa")
  @scala.inline
  def kV: typingsJapgolly.convertUnits.convertUnitsStrings.kV = this.cast("kV")
  @scala.inline
  def kVA: typingsJapgolly.convertUnits.convertUnitsStrings.kVA = this.cast("kVA")
  @scala.inline
  def kVAR: typingsJapgolly.convertUnits.convertUnitsStrings.kVAR = this.cast("kVAR")
  @scala.inline
  def kVARh: typingsJapgolly.convertUnits.convertUnitsStrings.kVARh = this.cast("kVARh")
  @scala.inline
  def kWh: typingsJapgolly.convertUnits.convertUnitsStrings.kWh = this.cast("kWh")
  @scala.inline
  def kg: typingsJapgolly.convertUnits.convertUnitsStrings.kg = this.cast("kg")
  @scala.inline
  def kl: typingsJapgolly.convertUnits.convertUnitsStrings.kl = this.cast("kl")
  @scala.inline
  def klSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.klSlashh = this.cast("kl/h")
  @scala.inline
  def klSlashmin: typingsJapgolly.convertUnits.convertUnitsStrings.klSlashmin = this.cast("kl/min")
  @scala.inline
  def klSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.klSlashs = this.cast("kl/s")
  @scala.inline
  def km: km_ = this.cast("km")
  @scala.inline
  def km2: typingsJapgolly.convertUnits.convertUnitsStrings.km2 = this.cast("km2")
  @scala.inline
  def km3: typingsJapgolly.convertUnits.convertUnitsStrings.km3 = this.cast("km3")
  @scala.inline
  def km3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.km3Slashs = this.cast("km3/s")
  @scala.inline
  def kmSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.kmSlashh = this.cast("km/h")
  @scala.inline
  def knot: typingsJapgolly.convertUnits.convertUnitsStrings.knot = this.cast("knot")
  @scala.inline
  def ksi: typingsJapgolly.convertUnits.convertUnitsStrings.ksi = this.cast("ksi")
  @scala.inline
  def l: typingsJapgolly.convertUnits.convertUnitsStrings.l = this.cast("l")
  @scala.inline
  def lSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.lSlashh = this.cast("l/h")
  @scala.inline
  def lSlashmin: typingsJapgolly.convertUnits.convertUnitsStrings.lSlashmin = this.cast("l/min")
  @scala.inline
  def lSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.lSlashs = this.cast("l/s")
  @scala.inline
  def lb: typingsJapgolly.convertUnits.convertUnitsStrings.lb = this.cast("lb")
  @scala.inline
  def lx: typingsJapgolly.convertUnits.convertUnitsStrings.lx = this.cast("lx")
  @scala.inline
  def m: typingsJapgolly.convertUnits.convertUnitsStrings.m = this.cast("m")
  @scala.inline
  def m2: typingsJapgolly.convertUnits.convertUnitsStrings.m2 = this.cast("m2")
  @scala.inline
  def m3: typingsJapgolly.convertUnits.convertUnitsStrings.m3 = this.cast("m3")
  @scala.inline
  def m3Slashh: typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashh = this.cast("m3/h")
  @scala.inline
  def m3Slashmin: typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashmin = this.cast("m3/min")
  @scala.inline
  def m3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashs = this.cast("m3/s")
  @scala.inline
  def mA: typingsJapgolly.convertUnits.convertUnitsStrings.mA = this.cast("mA")
  @scala.inline
  def mHz: mHz_ = this.cast("mHz")
  @scala.inline
  def mSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.mSlashh = this.cast("m/h")
  @scala.inline
  def mSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.mSlashs = this.cast("m/s")
  @scala.inline
  def mV: typingsJapgolly.convertUnits.convertUnitsStrings.mV = this.cast("mV")
  @scala.inline
  def mVA: mVA_ = this.cast("mVA")
  @scala.inline
  def mVAR: mVAR_ = this.cast("mVAR")
  @scala.inline
  def mVARh: mVARh_ = this.cast("mVARh")
  @scala.inline
  def mW: mW_ = this.cast("mW")
  @scala.inline
  def mWh: mWh_ = this.cast("mWh")
  @scala.inline
  def mcg: typingsJapgolly.convertUnits.convertUnitsStrings.mcg = this.cast("mcg")
  @scala.inline
  def mg: typingsJapgolly.convertUnits.convertUnitsStrings.mg = this.cast("mg")
  @scala.inline
  def mi: typingsJapgolly.convertUnits.convertUnitsStrings.mi = this.cast("mi")
  @scala.inline
  def mi2: typingsJapgolly.convertUnits.convertUnitsStrings.mi2 = this.cast("mi2")
  @scala.inline
  def min: typingsJapgolly.convertUnits.convertUnitsStrings.min = this.cast("min")
  @scala.inline
  def minSlashkm: typingsJapgolly.convertUnits.convertUnitsStrings.minSlashkm = this.cast("min/km")
  @scala.inline
  def ml: typingsJapgolly.convertUnits.convertUnitsStrings.ml = this.cast("ml")
  @scala.inline
  def mlSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.mlSlashs = this.cast("ml/s")
  @scala.inline
  def mm: typingsJapgolly.convertUnits.convertUnitsStrings.mm = this.cast("mm")
  @scala.inline
  def mm2: typingsJapgolly.convertUnits.convertUnitsStrings.mm2 = this.cast("mm2")
  @scala.inline
  def mm3: typingsJapgolly.convertUnits.convertUnitsStrings.mm3 = this.cast("mm3")
  @scala.inline
  def mm3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.mm3Slashs = this.cast("mm3/s")
  @scala.inline
  def month: typingsJapgolly.convertUnits.convertUnitsStrings.month = this.cast("month")
  @scala.inline
  def ms: typingsJapgolly.convertUnits.convertUnitsStrings.ms = this.cast("ms")
  @scala.inline
  def mt: typingsJapgolly.convertUnits.convertUnitsStrings.mt = this.cast("mt")
  @scala.inline
  def mu: typingsJapgolly.convertUnits.convertUnitsStrings.mu = this.cast("mu")
  @scala.inline
  def ns: typingsJapgolly.convertUnits.convertUnitsStrings.ns = this.cast("ns")
  @scala.inline
  def oz: typingsJapgolly.convertUnits.convertUnitsStrings.oz = this.cast("oz")
  @scala.inline
  def pnt: typingsJapgolly.convertUnits.convertUnitsStrings.pnt = this.cast("pnt")
  @scala.inline
  def pntSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashh = this.cast("pnt/h")
  @scala.inline
  def pntSlashmin: typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashmin = this.cast("pnt/min")
  @scala.inline
  def pntSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashs = this.cast("pnt/s")
  @scala.inline
  def ppb: typingsJapgolly.convertUnits.convertUnitsStrings.ppb = this.cast("ppb")
  @scala.inline
  def ppm: typingsJapgolly.convertUnits.convertUnitsStrings.ppm = this.cast("ppm")
  @scala.inline
  def ppq: typingsJapgolly.convertUnits.convertUnitsStrings.ppq = this.cast("ppq")
  @scala.inline
  def ppt: typingsJapgolly.convertUnits.convertUnitsStrings.ppt = this.cast("ppt")
  @scala.inline
  def psi: typingsJapgolly.convertUnits.convertUnitsStrings.psi = this.cast("psi")
  @scala.inline
  def qt: typingsJapgolly.convertUnits.convertUnitsStrings.qt = this.cast("qt")
  @scala.inline
  def qtSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.qtSlashs = this.cast("qt/s")
  @scala.inline
  def rad: typingsJapgolly.convertUnits.convertUnitsStrings.rad = this.cast("rad")
  @scala.inline
  def radSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.radSlashs = this.cast("rad/s")
  @scala.inline
  def rpm: typingsJapgolly.convertUnits.convertUnitsStrings.rpm = this.cast("rpm")
  @scala.inline
  def s: typingsJapgolly.convertUnits.convertUnitsStrings.s = this.cast("s")
  @scala.inline
  def sSlashft: typingsJapgolly.convertUnits.convertUnitsStrings.sSlashft = this.cast("s/ft")
  @scala.inline
  def sSlashm: typingsJapgolly.convertUnits.convertUnitsStrings.sSlashm = this.cast("s/m")
  @scala.inline
  def t: typingsJapgolly.convertUnits.convertUnitsStrings.t = this.cast("t")
  @scala.inline
  def torr: typingsJapgolly.convertUnits.convertUnitsStrings.torr = this.cast("torr")
  @scala.inline
  def tsp: typingsJapgolly.convertUnits.convertUnitsStrings.tsp = this.cast("tsp")
  @scala.inline
  def tspSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.tspSlashs = this.cast("tsp/s")
  @scala.inline
  def week: typingsJapgolly.convertUnits.convertUnitsStrings.week = this.cast("week")
  @scala.inline
  def yd3: typingsJapgolly.convertUnits.convertUnitsStrings.yd3 = this.cast("yd3")
  @scala.inline
  def yd3Slashh: typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashh = this.cast("yd3/h")
  @scala.inline
  def yd3Slashmin: typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashmin = this.cast("yd3/min")
  @scala.inline
  def yd3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashs = this.cast("yd3/s")
  @scala.inline
  def year: typingsJapgolly.convertUnits.convertUnitsStrings.year = this.cast("year")
}

