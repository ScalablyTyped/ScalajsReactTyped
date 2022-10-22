package typingsJapgolly.ranjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ranjs.anon.Accepted
import typingsJapgolly.ranjs.anon.Closed
import typingsJapgolly.ranjs.anon.Cv
import typingsJapgolly.ranjs.anon.D
import typingsJapgolly.ranjs.anon.Passed
import typingsJapgolly.ranjs.mod._ts.Commons
import typingsJapgolly.ranjs.mod.la.Matrix
import typingsJapgolly.ranjs.ranjsStrings.InverseChi
import typingsJapgolly.ranjs.ranjsStrings.continuous
import typingsJapgolly.ranjs.ranjsStrings.discrete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object _dist {
    
    @js.native
    trait Distribution[T] extends StObject {
      
      def aic(data: js.Array[Double]): Double = js.native
      
      def bic(data: js.Array[Double]): Double = js.native
      
      def cHazard(x: Double): Double = js.native
      
      def cdf(x: Double): Double = js.native
      
      def hazard(x: Double): Double = js.native
      
      def lnL(data: js.Array[Double]): Double = js.native
      
      def load(state: State[T]): this.type = js.native
      
      def logPdf(x: Double): Double = js.native
      
      def pdf(x: Double): Double = js.native
      
      def q(p: Double): js.UndefOr[Double] = js.native
      
      def sample(): Double = js.native
      def sample(n: Double): js.Array[Double] = js.native
      
      def save(): State[T] = js.native
      
      def seed(value: String): this.type = js.native
      def seed(value: Double): this.type = js.native
      
      def support(): js.Array[Closed] = js.native
      
      def survival(x: Double): Double = js.native
      
      def test(values: js.Array[Double]): Passed = js.native
      
      def `type`(): discrete | continuous = js.native
    }
    
    @js.native
    trait State[T] extends StObject
  }
  
  object _mc {
    
    @js.native
    trait MCMC extends StObject {
      
      def ac(): js.Array[Double] = js.native
      
      def ar(): Double = js.native
      
      def iterate(): Accepted = js.native
      def iterate(callback: js.Function2[/* x */ js.Array[Double], /* accepted */ Boolean, Unit]): Accepted = js.native
      def iterate(callback: js.Function2[/* x */ js.Array[Double], /* accepted */ Boolean, Unit], warmUp: Boolean): Accepted = js.native
      def iterate(callback: Unit, warmUp: Boolean): Accepted = js.native
      
      def sample(): js.Array[js.Array[Double]] = js.native
      def sample(progress: js.Function1[/* percentage */ Double, Unit]): js.Array[js.Array[Double]] = js.native
      def sample(progress: js.Function1[/* percentage */ Double, Unit], size: Double): js.Array[js.Array[Double]] = js.native
      def sample(progress: Unit, size: Double): js.Array[js.Array[Double]] = js.native
      
      def state(): State = js.native
      
      def statistics(): js.Array[Cv] = js.native
      
      def warmUp(): Unit = js.native
      def warmUp(progress: js.Function1[/* percentage */ Double, Unit]): Unit = js.native
      def warmUp(progress: js.Function1[/* percentage */ Double, Unit], maxBatches: Double): Unit = js.native
      def warmUp(progress: Unit, maxBatches: Double): Unit = js.native
    }
    
    @js.native
    sealed trait State extends StObject
  }
  
  object _ts {
    
    trait Commons extends StObject {
      
      def reset(): Unit
      
      def update(x: js.Array[Double]): Unit
    }
    object Commons {
      
      inline def apply(reset: Callback, update: js.Array[Double] => Callback): Commons = {
        val __obj = js.Dynamic.literal(reset = reset.toJsFn, update = js.Any.fromFunction1((t0: js.Array[Double]) => update(t0).runNow()))
        __obj.asInstanceOf[Commons]
      }
      
      extension [Self <: Commons](x: Self) {
        
        inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
        
        inline def setUpdate(value: js.Array[Double] => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
      }
    }
  }
  
  object dist {
    
    type Alpha = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Alpha]
    
    type Anglit = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Anglit]
    
    type Arcsine = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Arcsine]
    
    type BaldingNichols = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.BaldingNichols]
    
    type Bates = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Bates]
    
    type Benini = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Benini]
    
    type BenktanderII = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.BenktanderII]
    
    type Bernoulli = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Bernoulli]
    
    type Beta = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Beta]
    
    type BetaBinomial = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.BetaBinomial]
    
    type BetaPrime = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.BetaPrime]
    
    type BetaRectangular = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.BetaRectangular]
    
    type Binomial = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Binomial]
    
    type BirnbaumSaunders = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.BirnbaumSaunders]
    
    type Borel = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Borel]
    
    type BorelTanner = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.BorelTanner]
    
    type BoundedPareto = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.BoundedPareto]
    
    type Bradford = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Bradford]
    
    type Burr = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Burr]
    
    type Categorical = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Categorical]
    
    type Cauchy = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Cauchy]
    
    type Chi = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Chi]
    
    type Chi2 = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Chi2]
    
    type Dagum = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Dagum]
    
    type Degenerate = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Degenerate]
    
    type Delaporte = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Delaporte]
    
    type DiscreteUniform = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.DiscreteUniform]
    
    type DiscreteWeibull = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.DiscreteWeibull]
    
    type Distribution[T] = typingsJapgolly.ranjs.mod._dist.Distribution[T]
    
    type DoubleGamma = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.DoubleGamma]
    
    type DoubleWeibull = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.DoubleWeibull]
    
    type DoublyNoncentralBeta = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.DoublyNoncentralBeta]
    
    type DoublyNoncentralF = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.DoublyNoncentralF]
    
    type DoublyNoncentralT = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.DoublyNoncentralT]
    
    type Erlang = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Erlang]
    
    type Exponential = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Exponential]
    
    type ExponentialLogarithmic = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.ExponentialLogarithmic]
    
    type F = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.F]
    
    type FisherZ = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.FisherZ]
    
    type FlorySchulz = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.FlorySchulz]
    
    type Frechet = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Frechet]
    
    type Gamma = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Gamma]
    
    type GammaGompertz = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.GammaGompertz]
    
    type GeneralizedExponential = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.GeneralizedExponential]
    
    type GeneralizedExtremeValue = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.GeneralizedExtremeValue]
    
    type GeneralizedGamma = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.GeneralizedGamma]
    
    type GeneralizedHermite = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.GeneralizedHermite]
    
    type GeneralizedLogistic = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.GeneralizedLogistic]
    
    type GeneralizedNormal = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.GeneralizedNormal]
    
    type GeneralizedPareto = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.GeneralizedPareto]
    
    type Geometric = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Geometric]
    
    type Gilbrat = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Gilbrat]
    
    type Gompertz = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Gompertz]
    
    type Gumbel = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Gumbel]
    
    type HalfGeneralizedNormal = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.HalfGeneralizedNormal]
    
    type HalfLogistic = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.HalfLogistic]
    
    type HalfNormal = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.HalfNormal]
    
    type HeadsMinusTails = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.HeadsMinusTails]
    
    type Hoyt = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Hoyt]
    
    type HyperbolicSecant = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.HyperbolicSecant]
    
    type Hyperexponential = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Hyperexponential]
    
    type Hypergeometric = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Hypergeometric]
    
    type InverseChi2 = typingsJapgolly.ranjs.mod._dist.Distribution[InverseChi]
    
    type InverseGamma = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.InverseGamma]
    
    type InverseGaussian = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.InverseGaussian]
    
    type InvertedWeibull = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.InvertedWeibull]
    
    type IrwinHall = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.IrwinHall]
    
    type JohnsonSB = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.JohnsonSB]
    
    type JohnsonSU = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.JohnsonSU]
    
    type Kumaraswamy = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Kumaraswamy]
    
    type Laplace = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Laplace]
    
    type Levy = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Levy]
    
    type Lindley = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Lindley]
    
    type LogCauchy = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.LogCauchy]
    
    type LogGamma = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.LogGamma]
    
    type LogLaplace = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.LogLaplace]
    
    type LogLogistic = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.LogLogistic]
    
    type LogNormal = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.LogNormal]
    
    type LogSeries = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.LogSeries]
    
    type Logarithmic = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Logarithmic]
    
    type Logistic = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Logistic]
    
    type LogisticExponential = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.LogisticExponential]
    
    type LogitNormal = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.LogitNormal]
    
    type Lomax = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Lomax]
    
    type Makeham = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Makeham]
    
    type MaxwellBoltzmann = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.MaxwellBoltzmann]
    
    type Mielke = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Mielke]
    
    type Moyal = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Moyal]
    
    type Nakagami = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Nakagami]
    
    type NegativeBinomial = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.NegativeBinomial]
    
    type NegativeHypergeometric = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.NegativeHypergeometric]
    
    type NeymanA = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.NeymanA]
    
    type NoncentralBeta = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.NoncentralBeta]
    
    type NoncentralChi = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.NoncentralChi]
    
    type NoncentralChi2 = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.NoncentralChi]
    
    type NoncentralF = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.NoncentralF]
    
    type NoncentralT = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.NoncentralT]
    
    type Normal = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Normal]
    
    type PERT = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.PERT]
    
    type Pareto = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Pareto]
    
    type Poisson = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Poisson]
    
    type PolyaAeppli = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.PolyaAeppli]
    
    type Power = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Power]
    
    type QExponential = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.QExponential]
    
    type R = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.R]
    
    type Rademacher = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Rademacher]
    
    type RaisedCosine = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.RaisedCosine]
    
    type Rayleigh = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Rayleigh]
    
    type Reciprocal = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Reciprocal]
    
    type ReciprocalInverseGaussian = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.ReciprocalInverseGaussian]
    
    type Rice = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Rice]
    
    type ShiftedLogLogistic = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.ShiftedLogLogistic]
    
    type Skellam = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Skellam]
    
    type SkewNormal = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.SkewNormal]
    
    type Slash = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Slash]
    
    type Soliton = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Soliton]
    
    type State[T] = typingsJapgolly.ranjs.mod._dist.State[T]
    
    type StudentT = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.StudentT]
    
    type StudentZ = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.StudentZ]
    
    type Trapezoidal = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Trapezoidal]
    
    type Triangular = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Triangular]
    
    type TukeyLambda = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.TukeyLambda]
    
    type UQuadratic = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.UQuadratic]
    
    type Uniform = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Uniform]
    
    type VonMises = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.VonMises]
    
    type Weibull = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Weibull]
    
    type Wigner = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Wigner]
    
    type YuleSimon = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.YuleSimon]
    
    type Zeta = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Zeta]
    
    type Zipf = typingsJapgolly.ranjs.mod._dist.Distribution[typingsJapgolly.ranjs.ranjsStrings.Zipf]
  }
  
  object la {
    
    @js.native
    trait Matrix extends StObject {
      
      def act(vec: Vector): Vector = js.native
      
      def add(mat: Matrix): Matrix = js.native
      
      def f(func: js.Function1[/* d */ Double, Double]): Matrix = js.native
      
      def ij(i: Double, j: Double): Double = js.native
      def ij(i: Double, j: Double, value: Double): Unit = js.native
      
      def ldl(): D = js.native
      
      def m(): js.Array[js.Array[Double]] = js.native
      
      def mult(max: Matrix): Matrix = js.native
      
      def scale(s: Double): Matrix = js.native
      
      def t(): Matrix = js.native
    }
    
    @js.native
    trait Vector extends StObject {
      
      def add(vec: Vector): Vector = js.native
      
      def dot(vec: Vector): Double = js.native
      
      def f(func: js.Function1[/* d */ Double, Double]): Vector = js.native
      
      def i(i: Double): Double = js.native
      def i(i: Double, value: Double): Unit = js.native
      
      def scale(s: Double): Vector = js.native
      
      def v(): js.Array[Double] = js.native
    }
  }
  
  object mc {
    
    type MCMC = typingsJapgolly.ranjs.mod._mc.MCMC
    
    type RWM = typingsJapgolly.ranjs.mod._mc.MCMC
    
    type State = typingsJapgolly.ranjs.mod._mc.State
  }
  
  object ts {
    
    trait AC
      extends StObject
         with Commons {
      
      def compute(): js.Array[js.Array[Double]]
    }
    object AC {
      
      inline def apply(
        compute: CallbackTo[js.Array[js.Array[Double]]],
        reset: Callback,
        update: js.Array[Double] => Callback
      ): AC = {
        val __obj = js.Dynamic.literal(compute = compute.toJsFn, reset = reset.toJsFn, update = js.Any.fromFunction1((t0: js.Array[Double]) => update(t0).runNow()))
        __obj.asInstanceOf[AC]
      }
      
      extension [Self <: AC](x: Self) {
        
        inline def setCompute(value: CallbackTo[js.Array[js.Array[Double]]]): Self = StObject.set(x, "compute", value.toJsFn)
      }
    }
    
    trait Cov
      extends StObject
         with Commons {
      
      def compute(): Matrix
    }
    object Cov {
      
      inline def apply(compute: CallbackTo[Matrix], reset: Callback, update: js.Array[Double] => Callback): Cov = {
        val __obj = js.Dynamic.literal(compute = compute.toJsFn, reset = reset.toJsFn, update = js.Any.fromFunction1((t0: js.Array[Double]) => update(t0).runNow()))
        __obj.asInstanceOf[Cov]
      }
      
      extension [Self <: Cov](x: Self) {
        
        inline def setCompute(value: CallbackTo[Matrix]): Self = StObject.set(x, "compute", value.toJsFn)
      }
    }
  }
}
